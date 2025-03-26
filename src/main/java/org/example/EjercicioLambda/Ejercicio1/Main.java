package org.example.EjercicioLambda.Ejercicio1;

public class Main{
    public static void main(String[] args) {
        CalculadoraI sum = (x,y) -> x + y;
        CalculadoraI substract = (x,y) -> x - y;
        CalculadoraI multiply = (x,y) -> x * y;
        CalculadoraI division = (x,y) -> x / y;

        System.out.println(calculate(3.0, 7.0, sum));
    }

    public static double calculate(double a, double b, CalculadoraI calculadoraI){
        return calculadoraI.operation(a, b);
    }
}
