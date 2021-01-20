package Task7;


import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        // Дан массив 1 2 3 4 5
        //Я ввожу в консоль число, которое равно индексу массива
        //Надо вывести элемент, который стоит по этому индексу
        //Т.е. ввожу 0 - должен ввестись первый эелмент

        Scanner num = new Scanner(System.in);
        int a;
        System.out.println("Введите значение A: ");
        a = num.nextInt();
        int b;
        System.out.println("Введите значение A: ");
        b = num.nextInt();

        int[] array = {1, 2, 3, 4, 5};

        int c = array[a];
        array[a] = array[b];
        array[b] = c;

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
