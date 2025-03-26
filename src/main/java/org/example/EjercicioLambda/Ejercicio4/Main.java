package org.example.EjercicioLambda.Ejercicio4;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        User user = new User("Juan Perez", "juan@perez.es", 35);
//        System.out.println(extractName(user, u -> u.getName()));
//        showName(user, u -> System.out.println(u.getName()));
        System.out.println(extractStringLength("123456", String::length));
    }

    public static String extractName(User user, Function<User, String> function) {
        return function.apply(user);
    }

    public static void showName(User user, Consumer<User> function) {
        function.accept(user);
    }

    public static Integer extractStringLength(String text, Function<String, Integer> function) {
        return function.apply(text);
    }
}
