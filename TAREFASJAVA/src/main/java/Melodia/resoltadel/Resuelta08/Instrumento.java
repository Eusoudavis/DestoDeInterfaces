package Melodia.resoltadel.Resuelta08;

import java.util.Arrays;

public abstract class Instrumento {

    protected Melodia.resoltadel.Resuelta08.Nota[] melodia;

    public Instrumento() {
        melodia = new Melodia.resoltadel.Resuelta08.Nota[0];
    }

    void add(Melodia.resoltadel.Resuelta08.Nota n) {
        melodia = Arrays.copyOf(melodia, melodia.length + 1); 
        melodia[melodia.length - 1] = n; 
    }

    abstract void interpretar(); 
}
