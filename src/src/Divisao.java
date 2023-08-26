package src;

import java.util.Scanner;

public class Divisao {
        Scanner scanner = new Scanner(System.in);
        
        public void Division(){
            System.out.print("Digite o numerador: ");
            double numerador = scanner.nextDouble();
        
            System.out.print("Digite o denominador: ");
            double denominador = scanner.nextDouble();
        
        try {
            double resultado = dividir(numerador, denominador);
            System.out.println("Resultado da divisão: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não é permitida.");
        }finally{
            System.out.println("O código foi realizado com sucesso!");
        }
        }
    
    public static double dividir(double numerador, double denominador) {
        if (denominador == 0) {
            throw new ArithmeticException("Divisão por zero.");
        }
        return numerador / denominador;
    }
}
