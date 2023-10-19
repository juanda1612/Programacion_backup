package PrimeraEvaluacion.Tema02.ejercicios;

import java.util.Scanner;

/*
La asociación de vinicultores quiere fijar el precio del kilo de uva, la cual se clasifica en dos tipos: A y B. Además, cada tipo de uva se clasifica en dos tamaños: 1 y 2. Se requiere determinar cuánto recibirá un productor por la uva que entrega en un embarque, considerando lo siguiente:


Preguntamos por el precio inicial del kilo de uva y el número de kilos que se van a cargar.
Si la uva es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1; y 30 céntimos si es de tamaño 2.
Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de tamaño 2.

 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String a = "A";
        String b = "B";
        System.out.println("Introduce un tipo(A o B)");
        String ab = teclado.nextLine();
        System.out.println("Introduce un tamaño (1 o 2)");
        int tamaño = teclado.nextInt();
        System.out.println("Introduce el precio del kilo");
        int precioKilo = teclado.nextInt();
        System.out.println("Introduce el numero de kilos");
        int numeroKilos = teclado.nextInt();
        double total;
        total = precioKilo * numeroKilos;
        if (ab.equals(a)){
            if (tamaño == 1){
                total = total + 0.20;
                System.out.println(total);
            } else if (tamaño == 2) {
                total = total + 0.30;
                System.out.println(total);
            }
        } else if (ab.equals(b)) {
            if (tamaño == 1){
                total = total - 0.30;
                System.out.println(total);
            } else if (tamaño == 2) {
                total = total - 0.50;
                System.out.println(total);
            }
        }
    }
}
