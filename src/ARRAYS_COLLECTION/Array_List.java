package ARRAYS_COLLECTION;

import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {
        // Коллекции
        ArrayList <Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(10);
        numbers.add(1000);
        int i = 0;
        for(Integer el : numbers){
            System.out.println("Elements "+ i +" = " + el);
            i++;

        }
        numbers.remove(1);
        numbers.add(1,1234);

        for(Integer el : numbers){
            System.out.println("Elements "+ " " +" = " + el);
            i++;
    }
        System.out.println(numbers.get(1));
}}
