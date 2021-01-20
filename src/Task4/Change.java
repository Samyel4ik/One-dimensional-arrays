package Task4;


import java.util.Arrays;
import java.util.Random;

public class Change {
    public static void main(String[] args) {
        // Даны действительные числа а1 ,а2 ,..., аn .
        // Поменять местами наибольший и наименьший элементы.
        int a = 10;
        int[] array = new int[a];
        int maxNum = array[0];
        int minNum = array[0];
        int indexMax = 0;
        int indexMin = 0;

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) - 5;
            System.out.print(array[i] + " ");            //первоночальный массив +++
        }

        for (int i = 0; i < array.length; i++) {
            if (maxNum < array[i]) {
                maxNum = array[i];
                indexMax = i;
            }
            if (minNum > array[i]) {
                minNum = array[i];
                indexMin = i;
            }
        }
        System.out.println();
        System.out.println("max num:" + maxNum + " Index " + indexMax + " ; " + " min num:" + minNum + " Index " + indexMin);

        int b = array[indexMax];
        array[indexMax] = array[indexMin];
        array[indexMin] = b;

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
    }
}
