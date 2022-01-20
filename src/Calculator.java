import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Введите первое число :");
        int num1 = scanner.nextInt();
        int result;
        System.out.print(" Введите второе число :");
        int num2 = scanner.nextInt();

        System.out.print(" Введите действие: ");
        String action = scanner.nextLine();
        action = scanner.nextLine();

        switch (action){
            case "+" :
                result = num1 + num2;
                System.out.println("Результат сложения чисел: "+ result);
                break;
            case "-" :
                result = num1 - num2;
                System.out.println("Результат вычитания чисел: "+ result);
                break;
            case "*" :
                result = num1*num2;
                System.out.println("Результат умножения чисел: " + result);
                break;
            case "/" :
                if( num2 == 0){
                    System.out.println(" Error");
                }
                else {
                    result = num1 / num2;
                    System.out.println("Результат деления чисел: " + result);

                }
                break;
            default:
                System.out.println(" Вы что-то ввели не так");
        }

    }
}
