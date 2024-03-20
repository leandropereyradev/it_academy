package n3ejercicio1;

public class Alumno {

    public Alumno(String nombre, int edad, String curso, double nota) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
        this.nota = nota;
    }

    private String nombre;
    private int edad;
    private String curso;
    private double nota;

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCurso() {
        return curso;
    }

    public double getNota() {
        return nota;
    }

    public String getInfo() {
        return "Nombre: " + nombre
                + "\nEdad: " + edad
                + "\nCurso: " + curso
                + "\nNota: " + nota
                + "\n";
    }
}
