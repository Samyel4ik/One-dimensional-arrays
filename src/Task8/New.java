package Task8;

public class New {
    public static void main(String[] args) {
        //Дана последовательность целых чисел а1, а2, ..., а n .
        // Образовать новую последовательность, выбросив из исходной те члены,
        // которые равны min ( а1, а2, ..., а n ).
        int array[] = {5, 3, 2, 7, 10};

        int t = 0; // количество индексов
        int num = array[0];

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if (i > 1) {
                t++;
            }
        }
        System.out.println();

        int array2[] = new int[t]; //новый массив

        int index = 0;
        for (int i = 2; i < 5; i++) {
            array2[index] = array[i];
            System.out.print(array2[index] + " ");
            index++;
        }
    }
}
