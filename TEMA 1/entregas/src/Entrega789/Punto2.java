package Entrega789;

public class Punto2 {

    //Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.
    public static void main(String[] args) {

        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("El valor del elemento en la posición [" + i + ", " + j + "] es " + array[i][j]);
            }
        }

    }

}
