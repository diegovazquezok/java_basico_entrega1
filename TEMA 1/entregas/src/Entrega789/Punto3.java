package Entrega789;

import java.util.Vector;

public class Punto3 {
    public static void main(String[] args) {
        Vector<String> miVector = new Vector<>();

        miVector.add("Elemento 1");
        miVector.add("Elemento 2");
        miVector.add("Elemento 3");
        miVector.add("Elemento 4");
        miVector.add("Elemento 5");

        miVector.remove(2);
        miVector.remove(1);

        System.out.println(miVector);
    }
}