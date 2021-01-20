package Task2;

public class Change {
    public static void main(String[] args) {
        // Дана последовательность действительных чисел а1 ,а2 ,..., ап.
        // Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.
        int a = 10;
        int[] array = new int[a];
        int z = 2;
        int n = 0;//количество замен


        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            if (i >= z) {
                array[i] = z;
                n++;
            }
            System.out.println(array[i]);
        }
        System.out.println("Количество замен:" + n);
    }
}
