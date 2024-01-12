package SegundaEvaluacion.poo.ejerciciosMetodos;
/*
Escribe un programa que pida una lista de palabras (la guardas como una cadena de texto) y, a continuación dé tres opciones:
Contar: pide una palabra, y me dice cuantas veces aparece en la lista
Modificar: pide una palabra, y a continuación otra, y modifica todas las apariciones de la primera por la segunda.
Eliminar: pide una , y la elimina de la lista.
Mostrar: muestra la lista de cadenas
Salir

 */

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio16 {
   public static Scanner teclado = new Scanner(System.in);  // asi puedo utilizar este Scanner en toda la clase
    public static void main(String[] args) {
        // hacemos las llamadas a los metodos
        String lista = pedirTexto("Introduce una lista de palabras: ");
        // Sacamos las palabras de la lista a un array
        String[] palabras = lista.split(" ");
        System.out.println(Arrays.toString(palabras));
        System.out.println("Esto es lo que ha devuelto el metodo en la primera llamada: " + lista);


        int opcion = 0;
        do {
            System.out.println("1. Contar\n2. Modificar\n3. Eliminar\n4. Mostrar\n5. Salir");
            System.out.println("Selecciona un opción (1-5)");
            opcion = teclado.nextInt(); teclado.nextLine();
            switch (opcion){
                case 1:
                    //Contar: pide una palabra, y me dice cuantas veces aparece en la lista
                    // como el metodo contar no devuelve nada, sino que implime el resultado, basta con la llamada
                    contar(palabras);
                    break;
                case 2:
                    //Modificar: pide una palabra, y a continuación otra, y modifica todas las apariciones de la primera por la segunda.
                    // como no devuelve nada, simplemente ponemos la llamada
                    modificar(lista);
                    break;
                case 3:
                    //Eliminar: pide una , y la elimina de la lista.
                    break;
                case 4:
                    //Mostrar: muestra la lista de palabras
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opcion incorrecta.");
            }
        }while (opcion != 5);
    }

    // programa que pida una lista de palabras(la guardas como una cadena de texto)
    public static String pedirTexto(String introduce){
        System.out.print(introduce);
        return teclado.nextLine();
    }

    public static void contar(String[] palabras){
        String palabra = pedirTexto("Introduce una palabra: ");
        int contador = 0;
        for (int i = 0; i < palabras.length; i++) {
            if (palabra.equals(palabras[i])){
                contador++;
            }
        }
        System.out.println("La palabra " + palabra + " aparece " + contador + " en la lista");
    }
    public static void modificar(String lista){
        String palabra1 = pedirTexto("Introduce una palabra de la lista: ");
        String palabra2 = pedirTexto("Por cual palabra la quieres sustituir?: ");
        lista = lista.replace(palabra1, palabra2);
        System.out.println(lista);
    }

}
