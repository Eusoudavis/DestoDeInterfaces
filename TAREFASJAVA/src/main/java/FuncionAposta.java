import java.util.Arrays;
import java.util.Scanner;

public class FuncionAposta {


    public static int revisarAposta(int [] gañadora, int [] usuario){

        int acertos = 0;

        for (int a: usuario
             ) {
            if(Arrays.binarySearch(gañadora, a) >= 0){
        acertos++;
        }
    }
    return acertos;}

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int contador = 0;
        int gañadora[] = {1, 1, 2, 3, 1, 5};
        int usuario[] = new int[6];

        for (int i=0; i< usuario.length; i++){

            System.out.println("Escriba a súa aposta: ");
            numero = sc.nextInt();
            usuario[i]=numero;
        }
       /* Arrays.sort(gañadora);
        System.out.println(gañadora);*/

        System.out.println("Acertos " + revisarAposta(usuario, gañadora));
    }

}


