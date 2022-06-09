public interface Remote {
    void power();
    void volumeUp();
    void volumeDown();
    void channelUp();
    void channelDown();

    void setVolume(int percent);
    void setChannel(int channel);
    void printStatus();
}
