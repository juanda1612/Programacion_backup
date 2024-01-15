package SegundaEvaluacion.Colecciones.Ejercicios.ejercicio02rae;
/*
Los miembros de la Real Academia de la Lengua ocupan sillones con las letras del abecedario español, minúsculas y mayúsculas (en la práctica, las letras v, w, x, y, z, Ñ, W, Y nunca se ocupan, pero nosotros no lo tendremos en cuenta). Cuando un sillón queda vacante, se nombra un nuevo académico para ocuparlo.
Implementar la clase Académico, cuyos atributos son el nombre y el año de ingreso.
Implementar un programa donde se crean cinco objetos Académico, que se insertan en un mapa en el que la clave es la letra del sillón que ocupan, y el valor un objeto de la clase Académico. Para ello implementar el método estático:
static boolean nuevoAcadémico(Map<Character, Académico> academia, Académico nuevo, Character letra),
donde se lleva a cabo la inserción después de comprobar que el carácter pasado como parámetro es una letra del abecedario.

 */
public class Academico {
    // atributos
    private String nombre;
    private int año;

    // constructor

    public Academico(String nombre, int año) {
        this.nombre = nombre;
        this.año = año;
    }

    // getters y setters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    // toString

    @Override
    public String toString() {
        return "Academico{" +
                "nombre='" + nombre + '\'' +
                ", año=" + año +
                '}';
    }
}
