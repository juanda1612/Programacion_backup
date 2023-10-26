package PrimeraEvaluacion.Tema02.ejercicios;
/*
Realizar un ejemplo de menú, donde podemos escoger las distintas opciones hasta que seleccionamos la opción de “Salir”.
 */

import java.util.Scanner;

public class Ejercicio39 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        while (true){
            int n = teclado.nextInt();
            System.out.println("(1)Configuracion");
            System.out.println("(2)Salir");

                switch (n) {
                    case 1:
                        n = teclado.nextInt();
                        System.out.println("Graficos");
                        System.out.println("(1)Atras");
                        if (n == 1) {
                            break;
                        }
                    case 2:
                        break;
                }

        }

    }
}
