public class Sumador {
    public int sumar(int n1, int n2){
        int resultado=0;
        for (int i=n1;i<=n2;i++){
            resultado=resultado+i;
        }
        return resultado;
    }
    public static void main(String[] args){
        Sumador s=new Sumador();
        int n1=1;
        int n2=5;
        int resultado=s.sumar(n1, n2);
        System.out.println(resultado);
    }
}
