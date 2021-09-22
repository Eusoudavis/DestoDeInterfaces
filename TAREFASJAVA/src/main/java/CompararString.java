import java.util.Scanner;

public class CompararString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String texto1;
        int valor1 = 0;
        int valor2= 0;
        String texto2;

        System.out.println("Introuza dúas frases: ");
        texto1 = sc.nextLine();
        texto2 = sc.nextLine();

        valor1 = texto1.length();
        valor2 = texto2.length();

        if (valor1 > valor2){
            System.out.println("O primeiro texto é maior ");

        }else if(valor2 > valor1){
            System.out.println("O segundo texto é maior");

        }else {
            System.out.println("Son malladas");

        }

    }
}
