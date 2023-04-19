package Entrega789;

import java.util.ArrayList;
import java.util.LinkedList;

public class Punto5 {

    //Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("1 Rosa");
        arrayList.add("2 Azul");
        arrayList.add("3 Verde");
        arrayList.add("4 Rojo");

        LinkedList<String> linkedList = new LinkedList<String>(arrayList);

        for (String elemento : arrayList) {
            System.out.println(elemento);
        }

        for (String elemento : linkedList) {
            System.out.println(elemento);
        }

    }

}
