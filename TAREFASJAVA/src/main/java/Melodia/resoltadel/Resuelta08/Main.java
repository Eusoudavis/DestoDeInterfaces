package Melodia.resoltadel.Resuelta08;

public class Main {
    public static void main(String[] args) {
        Nota cancion[] = {Nota.FA,Nota.DO};
        Piano piano = new Piano();
        for (Nota nota: cancion){
            piano.add(nota);
        }
        piano.interpretar();
    }
}

