package code.structural.bridge.device_remote.remote;

import code.structural.bridge.device_remote.device.Device;

public class AdvancedRemote extends BasicRemote {

    public AdvancedRemote(Device device) {
        super(device);
    }

    public void mute() {
        device.setVolume(0);
    }

}
