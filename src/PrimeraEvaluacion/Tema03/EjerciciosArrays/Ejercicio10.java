package PrimeraEvaluacion.Tema03.EjerciciosArrays;
/*
Haz un programa que pida un número al usuario un número de mes (por ejemplo, el 4) y diga cuántos días tiene (por ejemplo, 30) y el nombre del mes. Debes usar arrays. Para simplificarlo vamos a suponer que febrero tiene 28 días.
 */

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero de mes");
        int[] mes = new int[12];
        for (int valor: mes) {
            valor = teclado.nextInt();
            switch (valor){
                case 1:
                    System.out.println("31 dias, Enero");
                case 2:
                    System.out.println("28 dias, Febrero");
                case 3:
                    System.out.println("31 dias, Marzo");
                case 4:
                    System.out.println("30 dias, Abril");
                case 5:
                    System.out.println("31 dias, Mayo");
                case 6:
                    System.out.println("30 dias, Junio");
                case 7:
                    System.out.println("31 dias, Julio");
                case 8:
                    System.out.println("31 dias, Agosto");
                case 9:
                    System.out.println("30 dias, Septiembre");
                case 10:
                    System.out.println("31 dias, Octubre");
                case 11:
                    System.out.println("30 dias, Noviembre");
                case 12:
                    System.out.println("31 dias, Diciembre");

            }
        }
    }
}
