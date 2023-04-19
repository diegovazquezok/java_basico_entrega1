package Entrega789;

import java.io.*;
import java.util.*;
public class Punto9 {

    //Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.


    public static void main(String[] args) {

        // Pedir el nombre del archivo al usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el nombre del archivo: ");
        String nombreArchivo = scanner.nextLine();

        // Crear un HashMap para almacenar las palabras y sus frecuencias
        Map<String, Integer> frecuencias = new HashMap<String, Integer>();

        // Leer el archivo y contar las frecuencias
        try (InputStream inputStream = new FileInputStream(nombreArchivo);
             Scanner scannerArchivo = new Scanner(inputStream)) {

            while (scannerArchivo.hasNext()) {
                String palabra = scannerArchivo.next();
                palabra = palabra.replaceAll("[^a-zA-Z]", "").toLowerCase(); // Quitar caracteres no alfabéticos
                if (!palabra.isEmpty()) {
                    int frecuencia = frecuencias.getOrDefault(palabra, 0);
                    frecuencias.put(palabra, frecuencia + 1);
                }
            }

        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
            System.exit(1);
        }

        // Ordenar las palabras por frecuencia
        List<Map.Entry<String, Integer>> listaFrecuencias = new ArrayList<>(frecuencias.entrySet());
        Collections.sort(listaFrecuencias, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue()); // Ordenar de mayor a menor frecuencia
            }
        });

        // Imprimir las palabras y sus frecuencias en la consola
        PrintStream stdout = System.out;
        for (Map.Entry<String, Integer> entrada : listaFrecuencias) {
            stdout.println(entrada.getKey() + ": " + entrada.getValue());
        }
    }
}
