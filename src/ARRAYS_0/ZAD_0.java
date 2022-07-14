package ARRAYS_0;


import java.util.Scanner;

public class ZAD_0 {
    public static void main(String[] args) {
        int [] array = new int [4];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length ; i++) {
            System.out.print("Vvedite znachenia ["+i+"]="  );
            int znachene = scanner.nextInt();
            array[i]=znachene;
        }
        System.out.println("=========================");
        System.out.println("Ваш введенные массив предстаален ниже-");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print(" ");

        }
        System.out.println("");
        System.out.println("=========================");
        System.out.print("Сумма єлементов всего маcсива равна=");
        int summ = 0;
        for (int i = 0; i < array.length; i++) {
            summ= array[i]+summ;
        }
        System.out.println(summ);
        System.out.println("=========================");



        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min>array[i]){
                min=array[i];
            }
        }
        System.out.println("Минимальный элемент маcсива:"+ min);

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max<array[i]){
                max=array[i];
            }
        }
        System.out.println("Максимальный элемент маcсива:"+ max);


    }
}
