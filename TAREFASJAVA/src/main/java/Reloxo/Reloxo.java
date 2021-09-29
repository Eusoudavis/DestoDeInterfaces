package Reloxo;

import java.util.Scanner;

public class Reloxo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tempo = 0;

        Hora h = new Hora();

        int segundosIntroducidos = 0;

        System.out.println("Introduza a hora " );
        tempo = sc.nextInt();
        h.setHora(tempo);
        System.out.println("Introduza o minuto " );
        tempo = sc.nextInt();
        h.setMinuto(tempo);
        System.out.println("Introduza os segundos " );
        tempo = sc.nextInt();
        h.setSegundo(tempo);

        System.out.println("Introduza os segundos " );
        segundosIntroducidos = sc.nextInt();

        for (int i=0; i<segundosIntroducidos; i++){
            System.out.println(h.getHora() + ":" + h.getMinuto() + ":" + h.getSegundo());
            h.sumarSegundo();
        }

    }
}
