package PrimeraEvaluacion.Tema03.EjerciciosString;
/*
Escribe un programa que lea una cadena de texto que consista en un nombre y sus apellidos y a continuación muestre las iniciales en mayúsculas.
 */

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        String cadena = teclado.nextLine();
        System.out.println("Introduce tu apellido");
        String cadena2 = teclado.nextLine();
        int n = cadena.length();

        cadena = cadena.substring(1 , n) + cadena.toUpperCase();

        System.out.println(cadena);
    }
}
