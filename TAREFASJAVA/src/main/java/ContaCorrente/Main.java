package ContaCorrente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(0, "78800199Z", "David");

        System.out.println("Nome " + cc.nome);
        System.out.println("DNI " + cc.dni);
        System.out.println("Saldo " + cc.getSaldo());


        cc.Ingresar(500);
       System.out.println("Salto tras ingreso " + cc.getSaldo());

        cc.reintegro(200);
        System.out.println("Saldo tras retirada " + cc.getSaldo());
    }
}
