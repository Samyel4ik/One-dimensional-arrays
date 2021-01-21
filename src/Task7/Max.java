package Task7;


import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        // пропускаю это задание.
        int[] array = {4, 2, 8, 9, 10, 6, 42, 8, 9};

        int index = 0; // индеус каждого втрого числа
        int twoNum = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println();
        for (int i = 1; i < array.length; i=i+2) {
            index = i;

            System.out.print(index+" ");
        }
    }
}
