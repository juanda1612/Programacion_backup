package SegundaEvaluacion.poo.clasesyobjetos.ejercicios.Aplicacion;

import java.util.Scanner;

public class Main {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        Usuario usuario = crearUsuario();
        System.out.println(usuario);
    }

    public static Usuario crearUsuario(){
        Usuario meterUsuario = new Usuario(teclado.nextLine(), teclado.nextLine(), teclado.nextLine());
        return meterUsuario;
    }
}
