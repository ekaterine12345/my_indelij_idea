public class Main {
    public static void main(String[] args) {

        Boolean onOff1=true;
        int volume1=30;
        int channel1=17;

        TV tv=new TV(onOff1);
        BaseicRemote baseicRemote1=new BaseicRemote(tv);

        baseicRemote1.setVolume(volume1);
        baseicRemote1.setChannel(channel1);

        baseicRemote1.power();
        baseicRemote1.volumeUp();
        baseicRemote1.volumeDown();
        baseicRemote1.channelUp();
        baseicRemote1.channelDown();
        baseicRemote1.printStatus();

        System.out.println("\n------------------------------------\n");

        Boolean onOff2=false;
        int volume2=100;
        int channel2=30;

        Radio radio=new Radio(onOff2);

        BaseicRemote baseicRemote2=new BaseicRemote(radio);

        baseicRemote2.setVolume(volume2);
        baseicRemote2.setChannel(channel2);

        baseicRemote2.power();
        baseicRemote2.volumeUp();
        baseicRemote2.volumeDown();
        baseicRemote2.channelUp();
        baseicRemote2.channelDown();
        baseicRemote2.printStatus();

        System.out.println("\n------------------------------------\n");

        onOff1=false;
        volume1=0;
        channel1=170;

        TV tv1=new TV(onOff1);
        AdvancedRemote advancedRemote1=new AdvancedRemote(tv1);
        advancedRemote1.setVolume(volume1);
        advancedRemote1.setChannel(channel1);


        advancedRemote1.power();
        advancedRemote1.volumeUp();
        advancedRemote1.volumeDown();
        advancedRemote1.channelUp();
        advancedRemote1.channelDown();
        advancedRemote1.printStatus();
        advancedRemote1.mute();

        System.out.println("\n------------------------------------\n");
        onOff2=true;
        volume2=1011;
        channel2=375;

        Radio radio1=new Radio(onOff2);

        AdvancedRemote advancedRemote2=new AdvancedRemote(radio1);
        advancedRemote2.setVolume(volume2);
        advancedRemote2.setChannel(channel2);

        advancedRemote2.power();
        advancedRemote2.volumeUp();
        advancedRemote2.volumeDown();
        advancedRemote2.channelUp();
        advancedRemote2.channelDown();
        advancedRemote2.printStatus();
        advancedRemote2.mute();

         }
}

