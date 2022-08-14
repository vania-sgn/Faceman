package ARRAYS_COLLECTION_0;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.random.RandomGenerator;

public class ZAD_0 {
    public static void main(String[] args) {
        ArrayList<Float> numbers = new ArrayList<>(4);
        LinkedList<Float> numbers_1 = new LinkedList<>();
        Random random = new Random();
        int i=0;
        while(i<4){
            numbers.add((random.nextFloat()*10)%2);
            numbers_1.add(0,(float)2);
            i++;
        }
        System.out.println("ArrayList "+numbers);
        System.out.println("LinkedList "+ numbers_1);


    }
}
