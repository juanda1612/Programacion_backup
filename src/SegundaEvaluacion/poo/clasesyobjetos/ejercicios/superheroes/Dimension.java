package SegundaEvaluacion.poo.clasesyobjetos.ejercicios.superheroes;

public class Dimension {
    private double alto;
    private double ancho;
    private double profundidad;

    public Dimension(){

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
                '}';
    }

    // Metodos
    public double getVolumen(){

        return 0;
    }
}
