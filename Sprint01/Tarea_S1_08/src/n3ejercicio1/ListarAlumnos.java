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
                .filter(alumno -> alumno.getNombre().toLowerCase().charAt(0) == 'a')
                .forEach(lista :: add);

        lista.forEach(alumno -> System.out.println(alumno.getInfo()));
    }
}
