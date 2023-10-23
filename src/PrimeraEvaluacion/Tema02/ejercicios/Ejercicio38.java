package PrimeraEvaluacion.Tema02.ejercicios;

import java.util.Scanner;

/*
Hacer un programa que pida caracteres e imprima ‘VOCAL’ si son vocales y ‘NO VOCAL’ en caso contrario, el programa termina cuando se introduce un espacio.
 */
public class Ejercicio38 {
    public static void main(String[] args) {
        String a = "a";
        a = "e";
        a = "i";
        a = "o";
        a = "u";
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un caracter");
        String vocal = teclado.nextLine();
        while (true){
            if (vocal == " "){
                System.out.println("terminado");
                break;
            }
            if (vocal.equals(a)){
                System.out.println("VOCAL");
            }else {
                System.out.println("CONSONANTE");
            }
            vocal = teclado.nextLine();
        }

    }
}
