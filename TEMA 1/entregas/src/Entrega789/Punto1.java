package Entrega789;

public class Punto1 {


    //Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
    public static String reverse(String texto) {
        return new StringBuilder(texto).reverse().toString();
    }
    public static void main(String[] args)
    {
        String str = "Hola Mundo";
        str = reverse(str);
        System.out.println(str);
    }




}
