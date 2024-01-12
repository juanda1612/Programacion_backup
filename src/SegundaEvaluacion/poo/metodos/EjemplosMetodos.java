package SegundaEvaluacion.poo.metodos;

import java.util.Scanner;

public class EjemplosMetodos {
    public static void main(String[] args) {
        double num1 = pedirNumero();
        double num2 = pedirNumero();
        // Mostramos el menu y guardamos la opcion que devuelve
        int opcion = menu();
        // realizamos la operacion solicitada
        realizarOperacion(opcion, num1, num2 );

    }
    public static double pedirNumero(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        return teclado.nextDouble();
    }

    //Creamos una calculadora de numeros decimales -> creamos o declaramos cuatro metodos
    // suma
    public static double suma(double a, double b){
        return a + b;
    }

    // resta
    public  static double resta(double a, double b){
        return a - b;
    }

    // multiplica
    public  static double multiplica(double a, double b){
        return a * b;
    }

    // divide
    public  static double divide(double a, double b){
        return a / b;
    }

    // metodo que muestre un menu con las 4 opciones y devuelva la opcion elegida
    public static int menu(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. division");
        return teclado.nextInt();
    }
    public static void realizarOperacion(int opcion, double numero1, double numero2){
        double resultado = 0;
        String signo = "";
        switch (opcion){
            case 1:
                resultado = suma(numero1, numero2);
                signo = " + ";
                break;
            case 2:
                resultado = resta(numero1, numero2);
                signo = " - ";
                break;
            case 3:
                resultado = multiplica(numero1, numero2);
                signo = " x ";
                break;
            case 4:
                resultado = divide(numero1, numero2);
                signo = " / ";
                break;
            default:
                System.out.println("Operacion incorrecta");
                break;
        }
        // mostramos el resultado
        if (!signo.equals("")){
            System.out.printf("%.2f %s %.2f = %.2f" , numero1 ,signo , numero2 , resultado);
        }
    }
}