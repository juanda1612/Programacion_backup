package PrimeraEvaluacion.Tema03.EjerciciosArrays;
/*
Hacer un programa que inicialice una lista de números con valores aleatorios (10 valores), y los muestre ordenados de menor a mayor.
 */

import java.util.Arrays;
import java.util.Random;

public class Ejercicio05 {
    public static void main(String[] args) {
        Random generador = new Random();
        int[] numeros = new int[10];
        System.out.println("Numeros introducidos");
        for (int i = 0; i < 10; i++) {
            numeros[i] = generador.nextInt(1, 10);
        }
        System.out.println(Arrays.toString(numeros));
        // y los muestre ordenados de menor a mayor
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
        }
    }

