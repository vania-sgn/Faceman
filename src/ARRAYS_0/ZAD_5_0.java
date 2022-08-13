package ARRAYS_0;

import java.util.Scanner;

public class ZAD_5_0 {
    public static void main (String[] args) {

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
        System.out.println("Введенный массив:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Массив 5*2 (максимальное и минимальное значение):");
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i][0];
            int max = arr[i][0];


                for (int j = 0; j < arr[0].length; j++) {
                    if (min > arr[i][j]) {
                        min = arr[i][j];
                    }
                    if (max < arr[i][j]) {
                        max = arr[i][j];
                    }


                }

                System.out.print(max+" "+min+'\n');
                //System.out.print("Максимальный элемент " + max + " Минимальный элемент " + min);

            }
        }
    }

