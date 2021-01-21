package Task10;

import java.util.Random;

public class Zero {
    public static void main(String[] args) {
        //Дан целочисленный массив с элементами п.
        // Сжать массив, выбросив из него каждый второй элемент
        // (освободившиеся элементы заполнить нулями).

        int p = 10;
        int[] array = new int[p];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) - 5;
            System.out.print(array[i] + " ");

        }
        System.out.println();
        int t = 0;
        for (int i = 0; i < array.length; i=i+2) {
            System.out.print(array[i]+" ");
        }

    }
}

