package CalculateAreaAbstractClass;

public class CalcularAbstrato extends Calcular {
    @Override
    public void setCalculateArea(double side){
        double result = side * side;

        System.out.println("A área do quadrado é igual a: " + result);
    }

    @Override
    public void setCalculateTriangleArea(double base, double height){
        double result = (base * height) / 2;

        System.out.println("O resultado da área do triângulo é: " + result);
    }

    @Override
    public void setCalculateCircleArea(double ray){
        double result = ray * ray * Math.PI;

        System.out.println("O resultado da área da circunferência é: " + result);
    }
}
