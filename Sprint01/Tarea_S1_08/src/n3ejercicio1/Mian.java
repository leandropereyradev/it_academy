package n3ejercicio1;

import static n3ejercicio1.ListarAlumnos.nombreEdad;
import static n3ejercicio1.ListarAlumnos.nombreLetraA;

public class Mian {
    public static void main(String[] args) {
        Alumno[] alumnos = new Alumno[10];

        alumnos[0] = new Alumno("Leandro", 40, "Java", 9.8);
        alumnos[1] = new Alumno("Armando", 38, "Marketing", 9.1);
        alumnos[2] = new Alumno("Lorena", 29, "React", 7.8);
        alumnos[3] = new Alumno("Pedro", 19, "Java", 9);
        alumnos[4] = new Alumno("Gonzalo", 34, "Marketing", 7.2);
        alumnos[5] = new Alumno("David", 42, "Java", 8.4);
        alumnos[6] = new Alumno("Marc", 51, "React", 9.2);
        alumnos[7] = new Alumno("Diana", 26, "Marketing", 5.4);
        alumnos[8] = new Alumno("Alejandra", 29, "Java", 2.1);
        alumnos[9] = new Alumno("Roberto", 40, "React", 7.3);

        System.out.println("Lista con Nombre y Edad:");
        nombreEdad(alumnos);

        System.out.println("Lista con Nombre que comienza con 'A':");
        nombreLetraA(alumnos);
    }
}
