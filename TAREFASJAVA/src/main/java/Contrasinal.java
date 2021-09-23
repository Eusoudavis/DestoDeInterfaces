import java.net.StandardSocketOptions;
import java.util.Scanner;

public class Contrasinal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String previo = "Marsupilami";
        String contrasinal;
        String pista = "";

        System.out.println("Introduza o seu contrasinal: ");
        contrasinal = sc.nextLine();

        if(previo.equals(contrasinal)){
            System.out.println("Ta ben, machiño");
        }else {
            System.out.println("Fallastes");
            for (int i = 0; i < previo.length(); i++) {
                    if (previo.charAt(i) != contrasinal.charAt(i)){
                       pista += contrasinal.charAt(i);
                    }else {
                        pista +="*";
                    }
                }
            }
        System.out.println(pista);

        }
    }

