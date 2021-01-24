package Task8;

public class New {
    public static void main(String[] args) {
        //Дана последовательность целых чисел а1, а2, ..., а n .
        // Образовать новую последовательность, выбросив из исходной те члены,
        // которые равны min ( а1, а2, ..., а n ).
        int array[] = {5, 3, 2, 7, 10}; // cюда можно добавить рандом
        int min = array[0];
        int t = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (array[i] > min) {
                t++;
            }
        }
        int array2[] = new int[t];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > min) {
                array[index] = array[i];
                System.out.print(array[index] + " ");
                index++;
            }
        }
    }
}
