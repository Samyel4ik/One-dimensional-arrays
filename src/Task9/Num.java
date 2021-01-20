package Task9;

import java.util.Random;

public class Num {
    public static void main(String[] args) {
       // В массиве целых чисел с элементами n найти наиболее часто встречающееся число.
        // Если таких чисел несколько, то определить наименьшее из них.
        int a=10;
        int[]array = new int[a];

        Random random = new Random();

        for(int i = 0 ; i < a ; i++) {
            array[i] = random.nextInt(10) - 5;
            System.out.println(array[i]);
        }
    }
}
