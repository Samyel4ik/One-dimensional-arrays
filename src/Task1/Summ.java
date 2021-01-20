package Task1;

public class Summ {
    public static void main(String[] args) {
        // В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

        int n = 10;
        int[] a = new int[n];
        int k = 2;

        int sum = 0;

        for (int i = 0; i < n; i++) {
            a[i] = i;

            if (a[i] % k == 0) {
                sum = sum + a[i];
            }
        }
        System.out.println(sum);
    }
}

