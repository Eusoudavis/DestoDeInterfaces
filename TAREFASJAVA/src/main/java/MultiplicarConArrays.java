public class MultiplicarConArrays {

    public static void main(String args[]) {

        int array[] = new int[11];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
      /*  for (int k = 0; k < array.length; k++) {
      int sil = array[k];
            ;*/
        for (int k : array) {

            System.out.println("\nTáboa do:" + k);
            for (int j = 0; j < array.length; j++) {
                System.out.println(k + " * " + j + " = " + k * j);
            }
        }
    }

    }




