package Task3;

import java.util.Random;

public class Arry {
    public static void main(String[] args) {
        //Дан массив действительных чисел, размерность которого N.
        // Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.
        int n = 10;
        int array[] = new int[n];
        int sum1 = 0;//положительные
        int sum2 = 0;//нулей
        int sum3 = 0;//отрицательные

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) - 5;
            System.out.println(array[i] + " ");

            if (array[i] > 0) {
                sum1++;
            }
            if (array[i] == 0) {
                sum2++;
            }
            if (array[i] < 0) {
                sum3++;
            }
        }
        System.out.println("Количество положительных эелементов: " + sum1);
        System.out.println("Количество нулевых эелементов: " + sum2);
        System.out.println("Количество отрицательных эелементов: " + sum3);
    }
}
