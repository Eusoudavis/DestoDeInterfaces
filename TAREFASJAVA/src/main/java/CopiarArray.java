import java.util.Arrays;
import java.util.Scanner;

public class CopiarArray {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int cousas[] = {1,2,3,4};
        int copia[] = new int[4];


            System.out.println("Escriba cantos números desexa copiar: ");
            numero = sc.nextInt();

        copia = Arrays.copyOf(cousas,numero);
            System.out.println(Arrays.toString(copia));
        }
}

