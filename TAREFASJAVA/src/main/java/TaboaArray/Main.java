package TaboaArray;

public class Main {
    public static void main(String[] args) {
        Taboa taboa = new Taboa();
        taboa.insertarFinal(2);
        taboa.insertarFinal(3);
        taboa.insertarPrincipio(2);
        taboa.insertarPrincipio(5);
        taboa.insertar(2,100);
        taboa.mostrar();
        System.out.println(taboa.get(2));
        System.out.println(taboa.buscar(2));


    }
}
