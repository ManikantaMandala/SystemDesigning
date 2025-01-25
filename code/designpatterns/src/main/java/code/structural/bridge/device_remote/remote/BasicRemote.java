package code.structural.bridge.device_remote.remote;

import code.structural.bridge.device_remote.device.Device;

public class BasicRemote implements Remote {
    protected Device device;

    public BasicRemote(Device device) {
        this.device = device;
    }

    @Override
    public void power() {
        if (device.isEnabled()) {
            device.disable();
        }
        device.enable();
    }

    @Override
    public void volumeUp() {
        int volume = device.getVolume();
        device.setVolume(volume + 10);
    }

    @Override
    public void volumeDown() {
        int volume = device.getVolume();
        device.setVolume(volume - 10);
    }

    @Override
    public void channelUp() {
        int channel = device.getChannel();
        device.setChannel(channel + 10);
    }

    @Override
    public void channelDown() {
        int channel = device.getChannel();
        device.setChannel(channel - 10);
    }

}
