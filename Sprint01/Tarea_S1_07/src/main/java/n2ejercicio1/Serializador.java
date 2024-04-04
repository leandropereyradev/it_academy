package n2ejercicio1;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Serializador {
    public static void toJSON(Object obj) {
        Class<?> clase = obj.getClass();
        JavaToJSON anotacion = clase.getAnnotation(JavaToJSON.class);

        String nombreClase = clase.getName().substring(clase.getName().lastIndexOf(".") + 1);
        String directorio = anotacion.directory();
        Path rutaCompleta = Path.of(System.getProperty("user.dir"), "Sprint01", "Tarea_S1_07", "src", directorio);
        File carpeta = rutaCompleta.toFile();

        if (!carpeta.exists()) {
            try {
                Files.createDirectories(rutaCompleta);

            } catch (IOException e) {
                System.out.println("Error: " + e);
                return;
            }
        }

        Gson gson = new Gson();
        String json = gson.toJson(obj);

        try (FileWriter writer = new FileWriter(rutaCompleta.resolve(nombreClase + ".json").toString())){
            writer.write(json);
            System.out.println("Objeto "+ nombreClase + " serializado a JSON correctamente.");

        } catch (IOException e) {
            System.out.println("Error: " + e);

        }

    }
}
