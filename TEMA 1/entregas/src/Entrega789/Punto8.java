package Entrega789;
import java.io.*;
public class Punto8 {

    //Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
    // La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".


    public static void copy(String fileIn, String fileOut) throws IOException {
        // Abrir el archivo de entrada y crear un InputStream
        FileInputStream fis = new FileInputStream(fileIn);
        InputStream is = new BufferedInputStream(fis);

        // Abrir el archivo de salida y crear un PrintStream
        FileOutputStream fos = new FileOutputStream(fileOut);
        PrintStream ps = new PrintStream(new BufferedOutputStream(fos));

        // Leer el archivo de entrada y escribir en el archivo de salida
        byte[] buffer = new byte[1024];
        int bytesRead;
        while ((bytesRead = is.read(buffer)) != -1) {
            ps.write(buffer, 0, bytesRead);
        }

        // Cerrar los streams
        ps.flush();
        ps.close();
        is.close();
    }

    public static void main(String[] args) throws IOException {
        String fileIn = "archivo_entrada.txt";
        String fileOut = "archivo_salida.txt";
        copy(fileIn, fileOut);
        System.out.println("Archivo copiado exitosamente!");
    }

}
