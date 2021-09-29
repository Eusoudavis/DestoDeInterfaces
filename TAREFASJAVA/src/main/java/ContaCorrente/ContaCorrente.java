package ContaCorrente;

import java.util.Scanner;

public class ContaCorrente {
    private double saldo;
    String dni;
    public String nome;
    public ContaCorrente(double saldo, String dni, String nome) {
        this.saldo = saldo;
        this.dni = dni;
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    /*public static Double Ingresar(double saldo) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cantidade a ingresar?");
        Double AIngresar = sc.nextDouble();
        saldo=saldo+AIngresar;
        //System.out.println("O seu saldo é de: " + saldo);
        return saldo;
    }*/

    /*public double Retirar(double saldo) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cantidade a retirar?");
        Double ARetirar = sc.nextDouble();
        if(saldo>ARetirar){
            saldo=saldo-ARetirar;
        }else{
            System.out.println("Saldo insuficiente. Non pode facer retiradas superiores a: " + saldo);
        }
        //System.out.println("O seu saldo é de: " + saldo);
        return saldo;
    }*/
    public boolean Ingresar(double s) {
        boolean ingresado = true;
        if (s < 0){
            ingresado = false;
        }else {
            saldo = saldo + s;}
        return ingresado;
        //System.out.println("O seu saldo é de: " + saldo);
    }

    public boolean reintegro(double s) {
        boolean reintegroCorrecto = true;
        if (s < 0) {
            reintegroCorrecto = false;
        } else if (saldo >= s) {
            saldo -= s;
        } else {
            reintegroCorrecto = false;
        }
        return reintegroCorrecto;
    }

   /* public String CrearConta(String nome, String dni, Double saldo){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduza nome");
        this.setNome(sc.nextLine());
        System.out.println("Introduza dni");
        this.setDni(sc.nextLine());
        this.setSaldo(0);
        return nome;
    }*/


}
