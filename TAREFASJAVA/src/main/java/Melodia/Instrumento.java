package Melodia;

import java.util.Arrays;

public abstract class Instrumento {

    protected String melodia[];

    public Instrumento(){
        melodia = new String[0];
    }

    void add(String n) {
        melodia = Arrays.copyOf(melodia, melodia.length + 1);
        melodia[melodia.length - 1] = n;
    }

    abstract void interpretar();
}
