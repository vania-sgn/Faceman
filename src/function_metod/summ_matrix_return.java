package function_metod;

public class summ_matrix_return {
    public static void main(String[] args) {
        int [] matrix = new int[]{ 5, 6, 8, -20 };

        int SUM1 = summaMatrix(matrix);
        System.out.println("Result_1= "+ SUM1);

        int [] matrix_2 = new int[]{ 5, 6, 8, -20, -100,-300, 1400 };

        int SUM2 = summaMatrix(matrix_2);
        System.out.println("Result_2= "+ SUM2);
    }

    public static int summaMatrix (int [] array){
        int summa = 0;
        for (int i = 0; i < array.length ; i++) {
            summa += array[i];
        }
        return summa;
    }
}
