package SegundaEvaluacion.poo.clasesyobjetos.ejercicios.Cajero;

import java.util.Scanner;

public class CuentaCorriente {
    private int DNI;
    private String nombreTitular;
    private double saldo;
    private Gestor gestor;

    public CuentaCorriente(int DNI, String nombreTitular) {
        this.DNI = DNI;
        this.nombreTitular = nombreTitular;
        this.saldo = 0;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public Gestor getGestor() {
        return gestor;
    }

    public void setGestor(Gestor gestor) {
        this.gestor = gestor;
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "DNI=" + DNI +
                ", nombreTitular='" + nombreTitular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
    static Scanner teclado = new Scanner(System.in);

    public void sacarDinero() {
        System.out.println("Cantidad a retirar");
        int pedir = teclado.nextInt();
        if (saldo > pedir) {
            saldo = saldo - pedir;
            System.out.println("Operacion realizada, nuevo saldo: " + saldo);
        } else {
            System.out.println("Operacion rechazada");
        }
    }
    public void ingresarDinero(){
        System.out.println("Cantidad a Ingresar");
        int ingreso = teclado.nextInt();
        if (ingreso > 5){
            saldo = saldo + ingreso;
            System.out.println("Su saldo es: " + saldo);
        } else {
            System.out.println("No puede ser.");
        }
    }
    public void actualizarLibreta(){
        System.out.println("Titular: " + nombreTitular);
        System.out.println("Saldo: " + saldo);
        System.out.println("**** Libreta actualizada ****");
    }


}
