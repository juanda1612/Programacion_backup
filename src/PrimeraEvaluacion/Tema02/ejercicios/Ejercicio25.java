package PrimeraEvaluacion.Tema02.ejercicios;
/*
[FOR ANIDADO]Hacer un programa que introduzca un número entero, positivo, y calcule su tabla de multiplicar, hasta llegar a él. (Nota: para  que los números queden alineados en columnas puedes usar el tabulador \t). Ejemplo:
 */

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        int producto = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                producto = i * producto;
                producto++;
                System.out.print(producto + " ");
            }
            System.out.println();
        }
    }
}
