package OOP;

import java.sql.SQLOutput;

public class Car {
    public int weight;
    public String name;
    public char color;
    public float speed;

    public void outPut(){
        System.out.println("Машина "+ name +" имеет вес "+ weight);
        System.out.println("Цвет "+ color +" Скорость достигает "+ speed);
    }

}
