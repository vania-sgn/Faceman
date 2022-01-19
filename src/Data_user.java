/*
import java.util.Scanner;

public class Data_user {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name ? - ");
        String name = scan.nextLine();
        System.out.println("My name is " + name );
        int num1= scan.nextInt();

        float num1=50, num2= 33;
        float res = num1 % num2;
        System.out.print(res);



    }
}
*/
import java.util.Scanner;

public class Data_user {

    public static void main(String[] args) {
        Scanner getInfo = new Scanner(System.in); // Объект класса Scanner
        System.out.print ("Введите ваше имя: ");
        String name = getInfo.nextLine ();
        System.out.print ("Введите вашу фамилию: ");
        String surname = getInfo.nextLine ();
        System.out.print ("Сколько вам лет, " + name + "?");
        int age = getInfo.nextInt ();
        System.out.print (name + " " + surname + " вам " + age + " лет");
    }
}