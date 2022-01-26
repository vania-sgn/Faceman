package function_metod;

public class Functions {
    public static void main(String[] args) {
//    info("Earth");
//    String java = "Java";
//    info(java);
//    info("");

    short num = 2;
    int result1 = summa((short)5,num);

    short num2 = 20;
    int result2 = summa((short)50,num2);
    info(String.valueOf(result2));


    }
    public static int summa(short a, short b){
        int res = a + b;
        String result = "Result "+ res;
        info(result);
        return res;
    }

    public static void info(String word){
        System.out.print(word);
        System.out.println("!");

    }
}
