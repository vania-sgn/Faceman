package ARRAYS;

public class array_matrix {

    public static void main(String[] args) {
        int[][] numbers = {
                {2, 45, 91},
                {90, 47, 82},
                {10, 5, 32},
                {8, 78, 30},
                {25, 1, 27},
                {38, 82, 83}
        };

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++)
                System.out.print(numbers[i][j] + " ");
            System.out.println("");
        }

    }
}