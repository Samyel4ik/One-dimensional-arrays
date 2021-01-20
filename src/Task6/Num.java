package Task6;

public class Num {
    public static void main(String[] args) {
        // Задана последовательность N вещественных чисел.
        // Вычислить количество чисел, порядковые номера которых являются простыми числами.
        int n = 15;
        int[] array = new int[n];
        int howMuch = 0;//сколько чисел
        int x = 2;
        int y;


        for (int i = 1; i < n; i++) {
            array[i] = i;
            y=array[i]%x;

            if (y != 0) {
                howMuch++;
            }
        }
        System.out.println(howMuch);
    }
}
