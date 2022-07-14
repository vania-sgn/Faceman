package ARRAYS_0;

public class Arrays_0_2 {
    public static void main(String[] args) {
        //Мноомерніе масивы
        int [][] array = new int [][] {
                {3,4},
                {1,2},
                {5,6}
        };
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum+=array[i][j];
            }
        }
        System.out.println(sum);
    }

}
