import java.util.Scanner;

public class if_case {
    public static void main(String[] args) {
     /*   Scanner scanner = new Scanner(System.in);
        System.out.print("Введите роль: ");
        String role = scanner.nextLine();
        System.out.print("Введите пароль : ");
        String pass = scanner.nextLine();
        if ( role.equals("Admin") && pass.equals("123321") ){
            System.out.print("У Вас есть доступ к базе");
        }
        else{
            System.out.print("Вы не имеете доступа админа, как Вас зовут?");
            String name = scanner.nextLine();
        }

      */
    // switch- case
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        switch (num){
            case 1:
                System.out.println("num 1");
                break;
            case 2:
                System.out.println("num 2");
                break;
            case 10:
                System.out.println("num 10");
                break;
            default:
                System.out.println("ne popal ");
        }
    }
}
