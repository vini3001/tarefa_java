import BankAccount.ContaCorrente;
import BankAccount.ContaPoupanca;
import CalculateAreaAbstractClass.CalcularAbstrato;
import CalculateAreaInterface.CalculateAreas;
import Devices.Radio;
import Devices.TV;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static ContaCorrente CC = new ContaCorrente();
    static ContaPoupanca CP = new ContaPoupanca();
    static CalcularAbstrato CA = new CalcularAbstrato();
    static CalculateAreas CAI = new CalculateAreas();
    static TV Television = new TV();
    static Radio radio = new Radio();

    public static void main(String[] args) {
        //Testes BankAccount

        CC.deposit(22);
        CC.investiment();
        CC.sacar(2);

        CP.deposit(22);
        CP.investiment();
        CP.sacar(2);

        //Testes CalculateAreaAbstractClass

        CA.setCalculateArea(2);
        CA.setCalculateCircleArea(2);
        CA.setCalculateTriangleArea(2, 4);

        //Testes CalculateAreaInterface

        CAI.setCalculateArea(2);
        CAI.setCalculateCircleArea(2);
        CAI.setCalculateTriangleArea(2, 4);

        //Testes Devices

        Television.turnUpVolume();
        Television.turnDownVolume();
        Television.turnOffOrTurnOn("On");
        Television.changeChannel(22);

        radio.turnUpVolume();
        radio.turnDownVolume();
        radio.turnOffOrTurnOn("On");
        radio.changeChannel(22);
        }
}