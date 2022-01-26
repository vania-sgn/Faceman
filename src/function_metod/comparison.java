package function_metod;

import java.util.Scanner;

public class comparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvod 1 number -");
        int number_1 = scanner.nextInt();
        System.out.println("Vvod 2 number -");
        int number_2 = scanner.nextInt();
        System.out.println(number_1 +" " + Raventstvo(number_1, number_2) + " " + number_1);

    }
    public static char Raventstvo ( int number_1, int number_2){
        if (number_1 < number_2)
            return('<');
        else if (number_1 > number_2)
            return('>');
        else
            return('=');
    }
}
