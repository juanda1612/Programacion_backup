package SegundaEvaluacion.poo.clasesyobjetos.edificio;

public class main {
    public static void main(String[] args) {
        // aqui creamos los objetos de tipo Edificio
        Edificio miCasa = new Edificio(4,50,1966);
        Edificio tuCasa = new Edificio(6, 100, 2015);
        // quiero ver el valor de los atributos
        System.out.println("Mi casa tiene: " + miCasa.getPlantas() + " plantas, " + miCasa.getMetros2() + " metros y fue construida en " + miCasa.getAño());

        System.out.println("Tu casa tiene: " + tuCasa.getPlantas() + " plantas, " + tuCasa.getMetros2() + " metros y fue construida en " + tuCasa.getAño());

    }
}
