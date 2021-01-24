package Task9;

import java.util.Arrays;

public class Num {
    public static void main(String[] args) {
        // В массиве целых чисел с элементами n найти наиболее часто встречающееся число.
        // Если таких чисел несколько, то определить наименьшее из них.
        int array[] = {5, 2, 7, 5, 3, 0, 2, 6, 2};

        int t = array.length;

        int array2[] = new int[t];

        for (int i = 0; i < array.length; i++) {
            array2[array[i]] = array2[array[i]] + 1;// массив подсчета количества чисел в исходном массиве
        }

        for (int i = 0; i < array2.length; i++) { // сколько повторяющихся чисел
            if (array2[i] > 1) {
                System.out.println("Число которое повторяется в массиве:" + i);
            }
        }
        int x = 0;
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] > 1) {
                if (x < i) {
                    x = i;
                    break;
                }
            }
        }
        System.out.println("Минимальное из повторяющихся чисел:" + x);

    }
}
