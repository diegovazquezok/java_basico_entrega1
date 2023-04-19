package JavaBasicoEntrega123;

public class Entrega3 {

    public static void main(String[] args) {
        String[] nombres = {"Julio", "Rosa", "Maria", "Raul"};
        String resultado = "";
        for (int i = 0; i < nombres.length; i++) {
            resultado += nombres[i] + " ";
        }
        System.out.println(resultado);
    }
}
