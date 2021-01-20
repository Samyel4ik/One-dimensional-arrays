package Task8;

import java.util.Random;

public class New {
    public static void main(String[] args) {
        //Дана последовательность целых чисел а1, а2, ..., а n .
        // Образовать новую последовательность, выбросив из исходной те члены,
        // которые равны min ( а1, а2, ..., а n ).
        int [] array = {1,2,3,4,5};

        int c = array[2];
        array[2] = array[4];
        array[4] = c;


        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i]+ " ");
        }
    }
}
