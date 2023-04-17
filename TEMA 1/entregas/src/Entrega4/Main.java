package Entrega4;

public class Main {

    public static void main(String[] args) {
        SmartPhone miSmartphone = new SmartPhone("Samsung", "Galaxy S20", 799.99, 128, 6.2);
        SmartWatch miSmartwatch = new SmartWatch("Apple", "Watch Series 6", 449.99, "watchOS", 18);

        System.out.println("Mi smartphone es un " + miSmartphone.getMarca() + " modelo " + miSmartphone.getModelo() + " valor " + miSmartphone.getPrecio() + " almacenamiento " + miSmartphone.getCapacidadAlmacenamiento() + " pantalla " + miSmartphone.getTamanoPantalla());
        System.out.println("Mi smartWatch es un " + miSmartwatch.getMarca() + " modelo " + miSmartwatch.getModelo() + " valor " + miSmartwatch.getPrecio() + " Sist. Op.  " + miSmartwatch.getSistemaOperativo() + " duración de bateria " + miSmartwatch.getDuracionBateria());

    }

}
