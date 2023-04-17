package JavaBasico;

public class Entrega2 {



    public static double precioIva(double precio) {
        double iva = precio * 0.21;
        double precioIva = precio + iva;
        return precioIva;
    }

    public static void main(String[] args) {


        double precio = 80;
        double precioFinal = precioIva(precio);
         System.out.println("El precio final de la compra es " + precioFinal);
    }
}
