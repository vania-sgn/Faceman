package function_metod;

import java.util.Scanner;

public class Passing_parameters {

    public static float delenie(float a, float b, float c) {
        if (b != 0 && c != 0)
            return (a / b / c);
        else
            return 1;
    }

    public static void main(String[] args) {
        float a1, b1, c1;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        a1 = in.nextFloat();
        System.out.print("Введите второе число: ");
        b1 = in.nextFloat();
        System.out.print("Введите третье число: ");
        c1 = in.nextFloat();
        System.out.print("Деление чисел равно: " + delenie(a1, b1, c1));
    }
}
