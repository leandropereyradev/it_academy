//package n1ejercicio4;

//import static n1ejercicio3.ListarAlfabeticamente.listarDirectorio;

//import n1ejercicio3.ListarAlfabeticamente;

//import n1ejercicio4.ListarAlfabeticamente;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Por favor, proporciona el directorio como argumento.");
            return;
        }

        String directorio = args[1];


        String flag = args[0];

        switch (flag) {
            case "-l":
                ListarAlfabeticamente.listarDirectorio(directorio, 0);
                break;

            case "-r":
                ListarAlfabeticamente.leerTxt(directorio);
                break;

            default:
            System.out.println("Flag no reconocido.");
            break;
        }

    }
}
