import java.util.Scanner;

public class Moda {

        public static void main(String args[]) {

            Scanner sc = new Scanner(System.in);
            int moda = 0;
            int maxVecesRepite = 0;
            int array [] = new int[10];
//int array[] = {1, 1, 2, 3, 1, 5, 1, 2, 3, 8};
            array[0] = 2;
            array[1] = 2;
            array[2] = 2;
            array[3] = 1;
            array[4] = 2;
            array[5] = 2;
            array[6] = 3;
            array[7] = 1;
            array[8] = 5;
            array[9] = 1;

            for (int i = 0; i < array.length; i++) {
                int vecesRepite = 0;
                for (int j = 0; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        vecesRepite++;
                    }
                }
                if (vecesRepite > maxVecesRepite) {

                    moda = array[i];
                    maxVecesRepite = vecesRepite;
                }
            }
            System.out.println("A moda é: " + moda);
        }
    }

