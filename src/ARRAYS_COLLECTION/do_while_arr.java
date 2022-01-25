package ARRAYS_COLLECTION;

import java.util.Scanner;

public class do_while_arr {

    public static void main(String[] args) {
        float[] a;
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Количество элемнетов в массиве: ");
        n = in.nextInt ();
        a = new float [n];
        int i = 0;
        do {
            System.out.print("Введите a[" + i + "] = ");
            a[i] = in.nextFloat ();
            i++;
        } while (i < n);

    }
}