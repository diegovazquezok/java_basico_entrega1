package Entrega4;

public class SmartPhone extends SmartDevice {
    private int capacidadAlmacenamiento;
    private double tamanoPantalla;

    public SmartPhone() {
        // Constructor vacío
    }

    public SmartPhone(String marca, String modelo, double precio, int capacidadAlmacenamiento, double tamanoPantalla) {
        super(marca, modelo, precio);
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
        this.tamanoPantalla = tamanoPantalla;
    }

    // Getters y setters
    public int getCapacidadAlmacenamiento() {
        return capacidadAlmacenamiento;
    }

    public void setCapacidadAlmacenamiento(int capacidadAlmacenamiento) {
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }

    public double getTamanoPantalla() {
        return tamanoPantalla;
    }

    public void setTamanoPantalla(double tamanoPantalla) {
        this.tamanoPantalla = tamanoPantalla;
    }
}

