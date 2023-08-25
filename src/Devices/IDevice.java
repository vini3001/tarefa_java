package Devices;

public interface IDevice {
    int volume = 0;
    public void turnOffOrTurnOn(String option);
    public void turnUpVolume();
    public void turnDownVolume();
    public void changeChannel(int channel);

}
