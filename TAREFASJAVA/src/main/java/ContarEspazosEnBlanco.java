import java.util.Scanner;

public class ContarEspazosEnBlanco {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba a súa frase: ");
        String cadea = sc.nextLine();
        int espazos = 0;
        for (int i = 0; i < cadea.length(); i++) {
            if (cadea.charAt(i) == ' ')
                espazos++;
        }
        System.out.println("Número de espacios en branco : " + espazos);
    }
}
