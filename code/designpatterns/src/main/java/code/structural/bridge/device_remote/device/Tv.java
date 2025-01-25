package code.structural.bridge.device_remote.device;

public class Tv implements Device {

    private boolean enabled = false;
    private int volume = 0;
    private int channel = 0;

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public void enable() {
        this.enabled = true;
    }

    @Override
    public void disable() {
        this.enabled = false;
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public void setVolume(int volume) {
        if (volume > 100) {
            this.volume = 100;
        } else if (volume < 0) {
            this.volume = 0;
        } else {
            this.volume = volume;
        }
    }

    @Override
    public int getChannel() {
        return this.channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public void printStatus() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Tv[enabled: " + (isEnabled() ? "enabled "
                : "disable ") + ", current channel: " + getChannel() +
                " , current volume: " + getVolume() + "]";
    }

}
