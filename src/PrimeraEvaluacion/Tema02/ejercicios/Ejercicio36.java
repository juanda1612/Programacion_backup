package PrimeraEvaluacion.Tema02.ejercicios;
/*
Hacer un programa que imprima por pantalla los veinte primeros múltiplos de 5.
 */

public class Ejercicio36 {
    public static void main(String[] args) {
        int contador = 1;
        int multiplo = 5;
        int total = 1;
        while (contador <= 20){
            total = contador * multiplo;
            System.out.print(total + " ");
            contador++;
        }
    }
}
