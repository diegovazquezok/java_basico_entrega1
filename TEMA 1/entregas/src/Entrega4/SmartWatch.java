package Entrega4;

public class SmartWatch extends SmartDevice {
    private String sistemaOperativo;
    private int duracionBateria;

    public SmartWatch() {
        // Constructor vacío
    }

    public SmartWatch(String marca, String modelo, double precio, String sistemaOperativo, int duracionBateria) {
        super(marca, modelo, precio);
        this.sistemaOperativo = sistemaOperativo;
        this.duracionBateria = duracionBateria;
    }

    // Getters y setters
    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public int getDuracionBateria() {
        return duracionBateria;
    }

    public void setDuracionBateria(int duracionBateria) {
        this.duracionBateria = duracionBateria;
    }
}
