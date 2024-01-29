package SegundaEvaluacion.poo.clasesyobjetos.ejercicios.Cajero;

public class Gestor {
    private String nombre;
    private String telefono;
    private double importeMaximo;

    public Gestor(String nombre, String telefono, double importeMaximo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.importeMaximo = importeMaximo;
    }

    public Gestor(String nombre, String telefono) {
        this(nombre,telefono, 10000);
    }

    public String getTelefono() {
        return telefono;
    }

}
