package org.example.EjercicioLambda.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Encrypt replaceLetters = (text) -> text.replaceAll("[a-zA-Z]", "X");
        Encrypt replaceNumbers = (text) -> text.replaceAll("[0-9]", "?");
        Encrypt replaceSpaces = (text) -> text.replaceAll(" ", "@");

        String text = operation("Hola que tal 123",replaceSpaces);
        String text2 = operation(text,replaceNumbers);
        String text3 = operation(text2,replaceLetters);
        System.out.println(text3);
    }

    public static String operation(String text, Encrypt encrypt) {
        return encrypt.operation(text);
    }
}
