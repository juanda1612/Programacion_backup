package PrimeraEvaluacion.Tema02.ejercicios;
/*
Realizar un ejemplo de menú, donde podemos escoger las distintas opciones hasta que seleccionamos la opción de “Salir”.
 */

import java.util.Scanner;

public class Ejercicio39 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero para iniciar");
        while (true){
            int n = teclado.nextInt();
            System.out.println("(1)Configuracion");
            System.out.println("(2)Salir");
            switch (n){
                case 1:
                    int n2 = teclado.nextInt();
                    System.out.println("Graficos");
                    System.out.println("Controles");
                    System.out.println("Sonido");
                    System.out.println("(1)Atras");
                    switch (n2){
                        case 1:
                            break;
                    }
                case 2:
                    break;
            }
        }
    }
}
