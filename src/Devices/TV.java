package Devices;

public class TV implements IDevice {
    int initialVolume = volume;
    @Override
    public void turnOffOrTurnOn(String option){
        if (option == "On"){
            System.out.println("Você ligou a TV");
        }else if(option == "Off"){
            System.out.println("Você desligou a TV");
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
        if(channel <= 50 && channel > 0){
            System.out.println("Você selecionou este canal: " + channel);
        }else{
            System.out.println("Canal não existente");
        }
    };
}
