package SegundaEvaluacion.poo.clasesyobjetos.avion;

public class Avion {
    private String nombre;
    private int aforo;
    private int velocidadMedia;
    private double coordenadas;

    public Avion(String nombre, int aforo, int velocidadMedia, double coordenadas) {
        this.nombre = nombre;
        this.aforo = aforo;
        this.velocidadMedia = velocidadMedia;
        this.coordenadas = coordenadas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAforo() {
        return aforo;
    }

    public void setAforo(int aforo) {
        this.aforo = aforo;
    }

    public int getVelocidadMedia() {
        return velocidadMedia;
    }

    public void setVelocidadMedia(int velocidadMedia) {
        this.velocidadMedia = velocidadMedia;
    }

    public double getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(double coordenadas) {
        this.coordenadas = coordenadas;
    }
}
