package ARRAYS_0;

import java.util.Scanner;

public class ZAD_3_1 {
    public static void main (String[] args) {
        int MAXVALUE = 5;
        int sum = 0;
        int count = 0;
        int a, b;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк массива: ");
        a = in.nextInt();

        System.out.print("Введите количество столбцов массива: ");
        b = in.nextInt();


        int[][] arr = new int[a][b];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Введите элемент arr[" + i + "][" + j + "]:");
                arr[i][j] = in.nextInt();
            }
        }
        in.close();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
                if (arr[i][j] > MAXVALUE) {
                    sum += arr[i][j];
                    count++;
                }
            }
            System.out.println();
        }

        System.out.println("Сума елементів, які більше " + MAXVALUE + " складає: " + sum +
                ". Їхня кількість дорівнює: " + count);

    }
}