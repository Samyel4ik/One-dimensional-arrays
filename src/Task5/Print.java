package Task5;

import java.util.Random;

public class Print {
    public static void main(String[] args) {
        //Даны целые числа а1, а2, ..., а н .
        // Вывести на печать только те числа, для которых а i > i .
        int a = 10;
        int array[] = new int[a];

        Random random = new Random();

        for (int i = 0; i < a; i++) {
            array[i] = random.nextInt(10) - 5;

            if (array[i] > i) {
                System.out.print("Число:" + array[i] + " ");
            }
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
    }
}


