package org.example.EjerciosStream.EjerciciosCurso;

import org.example.EjerciosStream.EjerciciosAlumnos.Alumno;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<>();
        addCursos(cursos);
        System.out.println("-------------------------------Ejercicio 1----------------------------------");
        getCursosWithMoreThan5Hours(cursos).forEach(System.out::println);
        System.out.println("-------------------------------Ejercicio 2----------------------------------");
        getCursosWithLessThan2Hours(cursos).forEach(System.out::println);
        System.out.println("-------------------------------Ejercicio 3----------------------------------");
        getCursosTitlesWithMoreThan50Videos(cursos).forEach(System.out::println);
        System.out.println("-------------------------------Ejercicio 4----------------------------------");
        show3CursosWithHighestDuracion(cursos);
        System.out.println("-------------------------------Ejercicio 5----------------------------------");
        showTotalHours(cursos);
        System.out.println("-------------------------------Ejercicio 6----------------------------------");
        showCursosMoreHoursThanAverage(cursos);
        System.out.println("-------------------------------Ejercicio 7----------------------------------");
        showCursosWithMoreThan500Alumnos(cursos);
        System.out.println("-------------------------------Ejercicio 8----------------------------------");
        System.out.println(getCursoWithHighestDuracion(cursos));
        System.out.println("-------------------------------Ejercicio 9---------------------------------");
        getCursosTitles(cursos).forEach(System.out::println);
    }

    public static List<Curso> getCursosWithMoreThan5Hours(List<Curso> cursos) {
        return cursos.stream().filter(c -> c.getDuracion() > 5).collect(Collectors.toList());
    }

    public static List<Curso> getCursosWithLessThan2Hours(List<Curso> cursos) {
        return cursos.stream().filter(c -> c.getDuracion() < 2).collect(Collectors.toList());
    }

    public static List<String> getCursosTitlesWithMoreThan50Videos(List<Curso> cursos) {
        return cursos.stream().filter(c -> c.getVideos() > 50).map(Curso::getTitulo).collect(Collectors.toList());
    }

    public static void show3CursosWithHighestDuracion(List<Curso> cursos) {
        cursos.stream().sorted(Comparator.comparingDouble(Curso::getDuracion).reversed()).limit(3).forEach(System.out::println);
    }

    public static void showTotalHours(List<Curso> cursos) {
        System.out.println(cursos.stream().mapToDouble(Curso::getDuracion).sum());
    }

    public static void showCursosMoreHoursThanAverage(List<Curso> cursos) {
        OptionalDouble averageHours = cursos.stream().mapToDouble(Curso::getDuracion).average();
        if(averageHours.isPresent()) {
            cursos.stream().filter(c -> c.getDuracion() > averageHours.getAsDouble()).forEach(System.out::println);
        }
    }

    public static void showCursosWithMoreThan500Alumnos(List<Curso> cursos) {
        cursos.stream().filter(c -> c.getAlumnos() > 500).forEach(System.out::println);
    }

    public static Curso getCursoWithHighestDuracion(List<Curso> cursos) {
        return cursos.stream().max(Comparator.comparingDouble(Curso::getDuracion)).orElse(null);
    }

    public static List<String> getCursosTitles(List<Curso> cursos) {
        return cursos.stream().map(Curso::getTitulo).collect(Collectors.toList());
    }

    public static void addCursos(List<Curso> cursos) {
        cursos.add(new Curso("Cursos profesional de Java", 6.5f, 50, 200 ));
        cursos.add(new Curso("Cursos profesional de Python", 8.5f, 60, 800 ));
        cursos.add(new Curso("Cursos profesional de DB", 4.5f, 70, 700 ));
        cursos.add(new Curso("Cursos profesional de Android", 7.5f, 10, 400 ));
        cursos.add(new Curso("Cursos profesional de Escritura", 1.5f, 10, 300 ));
    }
}
