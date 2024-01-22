package SegundaEvaluacion.poo.clasesyobjetos.ejercicios.Cajero;

public class Main {
    public static void main(String[] args) {
        CuentaCorriente usuario1 = new CuentaCorriente(335165, "asdasda");
        System.out.println(usuario1);
        usuario1.sacarDinero();
        usuario1.ingresarDinero();
        usuario1.sacarDinero();
        usuario1.actualizarLibreta();
    }
}
