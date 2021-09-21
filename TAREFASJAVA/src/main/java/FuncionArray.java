/*TAREFA
Crear un programa que conteña unha función que reciba por parámetro un array de enteiros e o devolva cargado
co número 7. Mostralo por pantalla utilizando o método toString.*/

import java.lang.reflect.Array;
import java.util.Arrays;

public class FuncionArray {

    public static int[] iniciarArray(int[] tablaEnteiros) {
        for (int i = 0; i < tablaEnteiros.length; i++) {
            tablaEnteiros[i] = 7;}

        return tablaEnteiros;
    }

    public static void main(String args[]){

        int tablaEnteiros[] = new int[10];

        for (int i = 0; i < tablaEnteiros.length; i++) {
            tablaEnteiros[i] = 0;}
        tablaEnteiros=iniciarArray(tablaEnteiros);

        for (int k : tablaEnteiros
             ) {
            System.out.println(k);

        }
        System.out.println(Arrays.toString(tablaEnteiros));
        }
}
