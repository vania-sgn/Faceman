package ARRAYS_COLLECTION;

public class arr_min {
    public static void main(String[] args) {
        int[] a = new int[] {-14, 23, 9, -4, 12, -1};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0)
                sum += a[i];
        }
        if (sum == 0)
            System.out.println("Нет цифер меньше 0");
        else
            System.out.println("sum = " + sum);
    }

}
