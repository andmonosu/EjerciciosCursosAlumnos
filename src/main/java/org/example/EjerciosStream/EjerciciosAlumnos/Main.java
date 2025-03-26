package org.example.EjerciosStream.EjerciciosAlumnos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Alumno> listaAlumnos = new ArrayList<>();
        addAlumno(listaAlumnos);
        System.out.println("------------------------Ejericio a------------------------------------");
        showAlumnoStartsWithLorG(listaAlumnos);
        System.out.println("------------------------Ejericio b------------------------------------");
        System.out.println("La longitud de la lista es: " + getSize(listaAlumnos));
        System.out.println("------------------------Ejericio c------------------------------------");
        getAlumnosWhit9AndPHP(listaAlumnos).forEach(System.out::println);
        System.out.println("------------------------Ejericio d------------------------------------");
        showOnly2Alumnos(listaAlumnos);
        System.out.println("------------------------Ejericio e------------------------------------");
        System.out.println(getLowestAgeAlumno(listaAlumnos));
        System.out.println("------------------------Ejericio f------------------------------------");
        System.out.println(getHighestAgeAlumno(listaAlumnos));
        System.out.println("------------------------Ejericio g------------------------------------");
        System.out.println(getFirstAlumno(listaAlumnos));
        System.out.println("------------------------Ejericio h------------------------------------");
        getAlumnosWithCursoLastLetterT(listaAlumnos).forEach(System.out::println);
        System.out.println("------------------------Ejericio i------------------------------------");
        getAlumnosWithCursoContainsA(listaAlumnos).forEach(System.out::println);
        System.out.println("------------------------Ejericio j------------------------------------");
        getAlumnosWithMoreThan10LettersNombre(listaAlumnos).forEach(System.out::println);
    }


    public static void showAlumnoStartsWithLorG(List<Alumno> listaAlumnos) {
        listaAlumnos.stream().filter(a -> a.getNombres().startsWith("L") || a.getNombres().startsWith("G")).forEach(System.out::println);
    }

    public static Integer getSize(List<Alumno> listaAlumnos) {
        return listaAlumnos.size();
    }

    public static List<Alumno> getAlumnosWhit9AndPHP(List<Alumno> listaAlumnos) {
        return listaAlumnos.stream().filter(a -> a.getNota() > 9 && a.getNombreCurso().equals("PHP")).collect(Collectors.toList());
    }

    public static void showOnly2Alumnos(List<Alumno> listaAlumnos) {
        listaAlumnos.stream().limit(2).forEach(System.out::println);
    }

    public static Alumno getLowestAgeAlumno(List<Alumno> listaAlumnos) {
        return listaAlumnos.stream().min(Comparator.comparingInt(Alumno::getEdad)).get();
    }

    public static Alumno getHighestAgeAlumno(List<Alumno> listaAlumnos) {
        return listaAlumnos.stream().max(Comparator.comparingInt(Alumno::getEdad)).get();
    }

    public static Alumno getFirstAlumno(List<Alumno> listaAlumnos) {
        return listaAlumnos.stream().findFirst().orElse(null);
    }

    public static List<Alumno> getAlumnosWithCursoLastLetterT(List<Alumno> listaAlumnos) {
        return listaAlumnos.stream().filter(a -> a.getNombreCurso().toLowerCase().endsWith("t")).collect(Collectors.toList());
    }

    public static List<Alumno> getAlumnosWithCursoContainsA(List<Alumno> listaAlumnos) {
        return listaAlumnos.stream().filter(a -> a.getNombreCurso().toLowerCase().contains("a")).collect(Collectors.toList());
    }

    public static List<Alumno> getAlumnosWithMoreThan10LettersNombre(List<Alumno> listaAlumnos) {
        return listaAlumnos.stream().filter(a -> a.getNombres().length() > 10).collect(Collectors.toList());
    }

    public static void addAlumno(List<Alumno> listaAlumnos) {
        listaAlumnos.add(new Alumno(1, "1717213183", "Javier Ignacio", "Molina Cano", "Java 8", 7, 28));
        listaAlumnos.add(new Alumno(2, "1717456218", "Lillian Eugenia", "Gómez Álvarez", "Java 8", 10, 33));
        listaAlumnos.add(new Alumno(3, "1717328901", "Sixto Naranjoe", "Marín", "Java 8", 8.6, 15));
        listaAlumnos.add(new Alumno(4, "1717567128", "Gerardo Emilio", "Duque Gutiérrez", "Java 8", 10, 13));
        listaAlumnos.add(new Alumno(5, "1717902145", "Jhony Alberto", "Sáenz Hurtado", "Java 8", 9.5, 15));
        listaAlumnos.add(new Alumno(6, "1717678456", "Germán Antonio", "Lotero Upegui", "Java 8", 8, 34));
        listaAlumnos.add(new Alumno(7, "1102156732", "Oscar Darío", "Murillo González", "Java 8", 8, 32));
        listaAlumnos.add(new Alumno(8, "1103421907", "Augusto Osorno", "Palacio Martínez", "PHP", 9.5, 17));
        listaAlumnos.add(new Alumno(9, "1717297015", "César Oswaldo", "Alzate Agudelo", "Java 8", 8, 26));
        listaAlumnos.add(new Alumno(10, "1717912056", "Gloria Amparo", "González Castaño", "PHP", 10, 28));
        listaAlumnos.add(new Alumno(11, "1717912058", "Jorge León", "Ruiz Ruiz", "Python", 8, 22));
        listaAlumnos.add(new Alumno(12, "1717912985", "John Jairo", "Duque García", "Java Script", 9.4, 32));
        listaAlumnos.add(new Alumno(13, "1717913851", "Julio Cesar", "González Castaño", "C Sharp", 10, 22));
        listaAlumnos.add(new Alumno(14, "1717986531", "Gloria Amparo", "Rodas Monsalve", "Ruby", 7, 18));
        listaAlumnos.add(new Alumno(15, "1717975232", "Gabriel Jaime", "Jiménez Gómez", "Java Script", 10, 18));
    }
}
