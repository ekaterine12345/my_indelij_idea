public class TV implements Device {

    Boolean onOff;
    int volume;
    int channel;

    public TV(Boolean onOff) {
        this.onOff = onOff;
    }

    @Override
    public boolean isEnabled() {

        return onOff;
    }

    @Override
    public void disable() {

        if (onOff) System.out.println("TV is on");
        else
        System.out.println("TV is off");
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public void setVolume(int percent) {

        this.volume=percent;
    }

    @Override
    public int getChannel() {
        return this.channel;
    }

    @Override
    public void setChannel(int channel) {

        this.channel=channel;
    }

    @Override
    public void printStatus() {
        System.out.println("TV Status: ");
        System.out.println("ON/OFF "+isEnabled());
        System.out.println("Volume "+getVolume());
        System.out.println("Channel "+getChannel());

    }
}
