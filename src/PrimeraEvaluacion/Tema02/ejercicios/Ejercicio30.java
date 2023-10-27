package PrimeraEvaluacion.Tema02.ejercicios;
/*
Realizar un programa que pida números (al arrancar el programa se pedirá por teclado la cantidad de números a introducir). El programa debe informar de cuántos números introducidos son mayores que 0, menores que 0 e iguales a 0.
 */

import java.util.Random;
import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random generador = new Random();
        System.out.println("Introduce el numero de numeros que se van a imprimir");
        int n = teclado.nextInt();
        int contadorM = 0;
        int contadorMe = 0;
        int contadorE = 0;
        for (int i = 0; i < n; i++) {
            int random = generador.nextInt(-100 , 100);
            if (random > 0 ){
                contadorM++;
            } else if (random == 0) {
                contadorE++;
            }else {
                contadorMe++;
            }
        }
        System.out.println("Mayores de 0: " + contadorM + " Menores de 0: " + contadorMe + " Iguales a 0: " + contadorE);
    }
}
