package TaboaArray;

import java.util.Arrays;

public class Taboa {
    Integer[] taboa;

    public Taboa() {
        taboa = new Integer[0];
    }

    void insertarPrincipio(int numero){
        taboa = Arrays.copyOf(taboa, taboa.length + 1);
        System.arraycopy(taboa, 0,taboa,1,taboa.length-1);
        taboa[0] = numero;
    }

    void insertar(int posicion, int nuevo) {
        taboa = Arrays.copyOf(taboa, taboa.length + 1);
        System.arraycopy(taboa, posicion, taboa, posicion + 1,
                taboa.length - posicion - 1);
        taboa[posicion] = nuevo;
    }

    int get(int indice){
        Integer resultado = null;
        if (indice>=0 && indice<taboa.length){
            resultado = taboa[indice];
        }
        return resultado;
    }

    int buscar(Integer clave){
        int indice = -1;
        for (int i = 0; i < taboa.length && indice ==-1; i++){
            if (taboa[i].equals(clave)){
                indice = i;
            }else {}
        }
        return indice;
    }

    void insertarFinal (int numero){
        taboa = Arrays.copyOf(taboa, taboa.length +1);
        taboa[taboa.length - 1] = numero;
    }

    public int numeroElementos(){
        return taboa.length;
    }
    public void mostrar(){
        System.out.println(Arrays.toString(taboa));
    }
}
