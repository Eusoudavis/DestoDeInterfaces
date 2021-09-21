import java.util.Arrays;
import java.util.Scanner;

public class CopiarArrayPorRango {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int posIni, posFin;
        int cousas[] = {1,2,3,4};
        int copia[] = new int[4];


        System.out.println("Escriba posición inicial: ");
        posIni = sc.nextInt();
        System.out.println("Escriba posición final: ");
        posFin = sc.nextInt();

        copia = Arrays.copyOfRange(cousas,posIni,posFin);
        System.out.println(Arrays.toString(copia));
    }
}
