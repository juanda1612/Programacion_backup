package SegundaEvaluacion.Colecciones.Ejercicios.ejercicio02rae;

import java.util.HashMap;
import java.util.Scanner;

/*
Los miembros de la Real Academia de la Lengua ocupan sillones con las letras del abecedario español, minúsculas y mayúsculas (en la práctica, las letras v, w, x, y, z, Ñ, W, Y nunca se ocupan, pero nosotros no lo tendremos en cuenta). Cuando un sillón queda vacante, se nombra un nuevo académico para ocuparlo.
Implementar la clase Académico, cuyos atributos son el nombre y el año de ingreso.
Implementar un programa donde se crean cinco objetos Académico, que se insertan en un mapa en el que la clave es la letra del sillón que ocupan, y el valor un objeto de la clase Académico. Para ello implementar el método estático:
static boolean nuevoAcadémico(Map<Character, Académico> academia, Académico nuevo, Character letra),
donde se lleva a cabo la inserción después de comprobar que el carácter pasado como parámetro es una letra del abecedario.

 */
public class Main {
    public static void main(String[] args) {
        // crear cinco academicos
        Academico academico1 = new Academico("Maria", 2004);
        Academico academico2 = new Academico("Pepito", 2005);
        Academico academico3 = new Academico("Alvaro", 2006);
        Academico academico4 = new Academico("Antonio", 2007);
        Academico academico5 = new Academico("Jose Manuel", 2008);

        HashMap<Character, Academico> mapa = new HashMap<>();
        mapa.put('A', academico1);
        mapa.put('B', academico2);
        mapa.put('C', academico3);
        mapa.put('D', academico4);
        mapa.put('E', academico5);

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una letra");
        char letra = teclado.next().charAt(0);
        System.out.println(mapa.get(letra));

    }
}
