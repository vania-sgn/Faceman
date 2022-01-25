package ARRAYS_COLLECTION;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int arr[] = new int[4];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arr.length ; i++) {

            System.out.print("Введите елемент массива: ");
            int value = scanner.nextInt();
            arr[i] = value;
        }
        System.out.println("Наш массив ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        int min = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if(min>arr[i]){
                min = arr[i];
                System.out.print("MIN Value- " );
                System.out.print(arr[i]);
            }

        }
    }
}
