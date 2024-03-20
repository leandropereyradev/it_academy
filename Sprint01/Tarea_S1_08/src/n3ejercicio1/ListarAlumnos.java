package n3ejercicio1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListarAlumnos {

    public static void nombreEdad(Alumno[] alumnos) {
        Arrays.stream(alumnos)
                .forEach(alumno -> System.out.println("Nombre: "
                        + alumno.getNombre() + "\nEdad: "
                        + alumno.getEdad() + "\n"));

    }

    public static void nombreLetraA(Alumno[] alumnos) {
        List<Alumno> lista = new ArrayList<>();

        Arrays.stream(alumnos)
                .filter(alumno -> alumno.getNombre().toLowerCase().startsWith("a"))
                .forEach(lista :: add);

        lista.forEach(alumno -> System.out.println(alumno.getInfo()));
    }

    public static void notaMayorCinco(Alumno[] alumnos) {
        Arrays.stream(alumnos)
                .filter(alumno -> alumno.getNota() >= 5)
                .forEach(alumno -> System.out.println(alumno.getInfo()));
    }

    public static void notaMayorCincoNoPHP(Alumno[] alumnos) {
        Arrays.stream(alumnos)
                .filter(alumno -> alumno.getNota() >= 5 && !"PHP".equals(alumno.getCurso()))
                .forEach(alumno -> System.out.println(alumno.getInfo()));
    }

    public static void hacenJavaMayoresEdad(Alumno[] alumnos) {
        Arrays.stream(alumnos)
                .filter(alumno -> alumno.getEdad() >= 18 && "Java".equals(alumno.getCurso()))
                .forEach(alumno -> System.out.println(alumno.getInfo()));
    }
}
