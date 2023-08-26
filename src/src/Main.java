package src;

public class Main {
    public static void main(String[]args){
        Divisao division = new Divisao();

        division.Division();
        ExcecaoPersonalizada.convertNumber("22");
        ConversorDeTemperatura.celsiusParaFahrenheit(22);
        ConversorDeTemperatura.celsiusParaKelvin(23);
        ConversorDeTemperatura.celsiusParaRankine(25);
        ConversorDeTemperatura.celsiusParaReaumur(26);
    }
}
