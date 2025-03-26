package org.example.EjercicioLambda.Ejercicio3;

public class Main {
    public static void main(String[] args) {
        EsPar esPar = (a) -> a%2 == 0;
        Integer numero = 8;
        System.out.printf("Es el numero %d par? %b", numero, process(numero, esPar));
    }

    public static Boolean process(int a, EsPar esPar) {
        return esPar.operation(a);
    }
}
