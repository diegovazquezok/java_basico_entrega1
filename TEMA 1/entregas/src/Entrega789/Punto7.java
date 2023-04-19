package Entrega789;

public class Punto7 {

    //Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException que será capturada por su llamante
    // (desde "main", por ejemplo). Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".

    public static void main(String[] args) {
        try {
            int resultado = DividePorCero(5, 0);
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }
    }

    public static int DividePorCero(int num1, int num2) throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException();
        }
        return num1 / num2;
    }


}
