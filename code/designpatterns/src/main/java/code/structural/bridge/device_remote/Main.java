package code.structural.bridge.device_remote;

import code.structural.bridge.device_remote.device.Device;
import code.structural.bridge.device_remote.device.Radio;
import code.structural.bridge.device_remote.device.Tv;
import code.structural.bridge.device_remote.remote.AdvancedRemote;
import code.structural.bridge.device_remote.remote.BasicRemote;
import code.structural.bridge.device_remote.remote.Remote;

public class Main {

	public static void main(String[] args) {
		
		Device tv = new Tv();
		Device radio = new Radio();

		AdvancedRemote tvRemote = new AdvancedRemote(tv);
		Remote radioRemote = new BasicRemote(radio);

		radioRemote.volumeUp();
		radio.printStatus();

		radioRemote.channelUp();
		radio.printStatus();

		radioRemote.channelDown();
		radio.printStatus();

		tvRemote.mute();
		tv.printStatus();

		tvRemote.channelDown();
		tv.printStatus();

	}
}
