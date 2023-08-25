package files.src.Devices;

public class Radio implements IDevice {
    int initialVolume = volume;
    @Override
    public void turnOffOrTurnOn(String option){
        if (option == "On"){
            System.out.println("Você ligou o rádio");
        }else if(option == "Off"){
            System.out.println("Você desligou o rádio");
        }
    };

    @Override
    public void turnUpVolume(){

        if (initialVolume <= 10){
            initialVolume = initialVolume + 1;

            System.out.println("O volume atual está em " + initialVolume);
        }else{
            System.out.println("O volume já está no máximo");
        };
    };

    @Override
    public void turnDownVolume(){

        if (initialVolume >= 0){
            initialVolume = initialVolume - 1;

            System.out.println("O volume atual está em " + initialVolume);
        }else{
            System.out.println("O volume já está no mínimo");
        };
    };

    @Override
    public void changeChannel(int channel){
        int minStation = 0;

        if (minStation <= 100){
            minStation = minStation + 10;

            System.out.println("A estação atual está em " + minStation);
        };
    };
}
