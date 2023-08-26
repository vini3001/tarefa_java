package src;

public class ConversorDeTemperatura {
    public static void celsiusParaFahrenheit(double celsius) {

        double fahrenheit = celsius * 1.8 + 32;
        System.out.println("Fahrenheit: " + fahrenheit);
    }

    public static void celsiusParaKelvin(double celsius) {
        double kelvin = celsius + 273.15;
        System.out.println("Kelvin: " + kelvin);
    }

    public static void celsiusParaReaumur(double celsius) {
        double reaumur = celsius * 0.8;
        System.out.println("Réaumur: " + reaumur);
    }

    public static void celsiusParaRankine(double celsius) {
        double rankine = celsius * 1.8 + 32 + 459.67;
        System.out.println("Rankine: " + rankine);
    }
}

