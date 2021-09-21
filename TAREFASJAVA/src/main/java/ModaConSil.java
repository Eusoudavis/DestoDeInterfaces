import java.net.StandardSocketOptions;
import java.util.Scanner;

public class ModaConSil {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int moda = 0;
        int maxVecesRepite = 0;
        int contador = 0;
        int numero = 0;
        int array [] = new int[10];

        for (int i=0; i< array.length; i++){

            System.out.println("Escriba 10 números: ");
            numero = sc.nextInt();
            contador++;

            array[i]=numero;
        }
        for (int k=0; k<array.length; k++) {
            int vecesRepite = 0;
            for (int j=0; j< array.length; j++){
                if (array[k]==array[j]){
                    vecesRepite++;}}

                    if (vecesRepite>maxVecesRepite) {

                        moda = array[k];
                        maxVecesRepite = vecesRepite;
            }
        }            System.out.println("A moda é : " + moda + " e repítese: " + maxVecesRepite + " veces");


    }
}
