import java.util.Scanner;

public class MODASILVIAHIPPIE {
    public static void main(String[] args) {
        int numero = 1, contador = 0, moda = 0, suma = 0;
        float media = 0.0f;
        int[] aNumeros = new int[9];
        Scanner scanner = new Scanner(System.in);
        while (numero!=10 && numero!=0) {
            contador++;
            System.out.println("Introduce números de 1 a 9, e 0 ou 10 para saír: ");
            numero = scanner.nextInt();
            suma += numero;
            //System.out.println("O número introducido foi: " + numero);
            for(int i=1;i<=aNumeros.length;i++){
                if(i==numero){
                    aNumeros[i-1] += 1;
                }
            }
        }
        System.out.println("A cantidade de números introducidos foi: " + (contador -1));
        media = suma /(contador -1);
        System.out.println("A media dos números introducidos foi: " + media);
        int i= 1, repeticionAnterior = 0;
        for(int repeticion: aNumeros){
            //System.out.println(i + ": "+repeticion);
            if(repeticion > repeticionAnterior){
                moda = i;
                repeticionAnterior = repeticion;
            }
            i++;
        }
        System.out.println("A moda é: " + moda + " repetindose " + repeticionAnterior);
    }
}
