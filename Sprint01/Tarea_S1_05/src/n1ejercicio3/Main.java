//package n1ejercicio3;

//import static n1ejercicio3.ListarAlfabeticamente.listarDirectorio;

//import n1ejercicio3.ListarAlfabeticamente;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Por favor, proporciona el directorio como argumento.");
            return;
        }

        String directorio = args[0];
        ListarAlfabeticamente.listarDirectorio(directorio, 0);
    }
}
