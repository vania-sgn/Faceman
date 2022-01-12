public class min_value {
    public static void main(String[] args) {
        int[] array= new int[] {12, 64,45,34,12,-100,12,8};
        int minValue = array[0];
        int minIndex = 0;
        for (int i = 0; i < array.length ; i++) {
            if (array[i]<minValue){
                minValue=array[i];
                minIndex = i;

            }
            System.out.printf("HELLO_GRISGA");
        }
        System.out.printf("minValue "+ minValue +  "\nindex "+minIndex);
    }
}
