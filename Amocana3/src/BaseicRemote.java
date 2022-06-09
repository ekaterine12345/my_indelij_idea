public class BaseicRemote implements Remote{
    Device d;

    public BaseicRemote(Device d) {
        this.d = d;
    }


    @Override
    public void power() {
        System.out.print(" power of ");
        d.disable();
    }

    @Override
    public void volumeUp() {
        System.out.println("volumeUp "+d.getVolume());
    }

    @Override
    public void volumeDown() {
        System.out.println("volumeDown "+ d.getVolume());
    }

    @Override
    public void channelUp() {
        System.out.println("channelUp "+d.getChannel());
    }

    @Override
    public void channelDown() {
        System.out.println("channelDown "+d.getChannel());
    }



    @Override
    public void setVolume(int percent) { //int percent
        d.setVolume(percent);
    }


    @Override
    public void setChannel(int channel) {

        d.setChannel(channel);
    }

    @Override
    public void printStatus() {
        d.printStatus();
    }
}
