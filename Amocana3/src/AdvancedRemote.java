public class AdvancedRemote extends BaseicRemote {

    Device d;
    Device d1;

    public AdvancedRemote(Device d) {
        super(d);
        d1=d;
       // System.out.println(d.getVolume()+" ppp");
    }

    @Override
    public void power() {
        super.power();
    }

    @Override
    public void volumeUp() {
        super.volumeUp();
    }

    @Override
    public void volumeDown() {
        super.volumeDown();
    }

    @Override
    public void channelUp() {
        super.channelUp();
    }

    @Override
    public void channelDown() {
        super.channelDown();
    }

    public void mute()
    {
        if (d1.getVolume()==0) System.out.println("This device is mute");
        else
            System.out.println("This device is not mute");
    }




}
