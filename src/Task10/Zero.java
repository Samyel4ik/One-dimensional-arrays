package Task10;

import java.util.Arrays;

public class Zero {
    public static void main(String[] args) {
        //Дан целочисленный массив с элементами п.
        // Сжать массив, выбросив из него каждый второй элемент
        // (освободившиеся элементы заполнить нулями).

        int[] array = {1, 2, 3, 4, 5};
        int t = array.length;//длинна масива

        System.out.println(Arrays.toString(array));

        int index = 0;
        int array2[] = new int[t];

        for (int i = 0; i < array.length; i = i + 2) {
            array2[index] = array[i];
            index++;
        }
        for (int i = 0; i < array2.length; i++) {
            array[i] = array2[i];
        }
        System.out.print(Arrays.toString(array));
    }
}

