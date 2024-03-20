package n3ejercicio1;

import static n3ejercicio1.ListarAlumnos.*;

public class Main {
    public static void main(String[] args) {
        Alumno[] alumnos = {
                new Alumno("Leandro", 40, "Java", 9.8),
                new Alumno("Armando", 38, "PHP", 9.1),
                new Alumno("Lorena", 29, "React", 4.8),
                new Alumno("Pedro", 19, "Java", 9),
                new Alumno("Gonzalo", 34, "Marketing", 7.2),
                new Alumno("David", 42, "PHP", 5),
                new Alumno("Marc", 51, "PHP", 9.2),
                new Alumno("Diana", 26, "Marketing", 5.4),
                new Alumno("Alejandra", 17, "Java", 2.1),
                new Alumno("Roberto", 40, "React", 3.3)
        };

        System.out.println("Lista con Nombre y Edad:");
        nombreEdad(alumnos);

        System.out.println("Lista con Nombre que comienza con 'A':");
        nombreLetraA(alumnos);

        System.out.println("Lista con alumnos con nota de 5 o mayor a este:");
        notaMayorCinco(alumnos);

        System.out.println("Lista con alumnos con nota de 5 o mayor a este y no son de PHP:");
        notaMayorCincoNoPHP(alumnos);

        System.out.println("Lista con alumnos que hacen JAVA y son mayores de edad:");
        hacenJavaMayoresEdad(alumnos);
    }
}
