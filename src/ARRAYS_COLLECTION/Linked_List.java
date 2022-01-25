package ARRAYS_COLLECTION;
import java.util.ArrayList;
import java.util.LinkedList;

public class Linked_List {

    public static void main(String[] args) {
        ArrayList<Float> digits = new ArrayList<>(4);
        LinkedList<Boolean> probability = new LinkedList<>();

        digits.add(4.6f);
        digits.add(5.1f);
        digits.add(0.201f);
        digits.add(0.5f);

        probability.add(true);
        probability.add(false);
        probability.add(true);
        probability.add(true);

        for(Float num : digits)
            System.out.println("Элемент равен: " + num);

        int i = 0;
        while(i < probability.size()) {
            System.out.println("Элемент равен: " + probability.get(i));
            i++;
        }
    }
}