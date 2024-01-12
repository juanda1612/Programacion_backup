package SegundaEvaluacion.poo.clasesyobjetos.avion;

public class Main {
    public static void main(String[] args) {
        Avion avion = new Avion("Airbus A320", 500, 400, 2.6);

        System.out.println("Nombre: " + avion.getNombre() + ", aforo: " + avion.getAforo() + ", Velocidad media: " + avion.getVelocidadMedia() + ", Coordenadas: " + avion.getCoordenadas());
    }
}
