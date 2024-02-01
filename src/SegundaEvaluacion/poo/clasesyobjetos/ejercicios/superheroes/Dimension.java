package SegundaEvaluacion.poo.clasesyobjetos.ejercicios.superheroes;

public class Dimension {
    private double alto;
    private double ancho;
    private double profundidad;

    public Dimension(){

    }
    public Dimension(double alto, double ancho, double profundidad) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundidad = profundidad;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }

    @Override
    public String toString() {
        return "Dimension{" +
                "alto=" + alto +
                ", ancho=" + ancho +
                ", profundidad=" + profundidad +
                ", volumen maximo=" + getVolumen(alto, ancho, profundidad) +
                '}';
    }

    // Metodos
    public double getVolumen(double alto, double ancho, double profundidad){
        double volumen = alto * ancho * profundidad;
        return volumen;
    }
}
