package OOP;

public class House {
    public int floors, year;
    public String name;

    public void set (int floors, int year, String name) {
        this.floors = floors;
        this.year = year;
        this.name = name;
    }

    public void printAll () {
        System.out.println(this.name + " построена в " + this.year + " году.");
        System.out.println("В " + this.name + " " + this.floors + " этажа.");
    }

    public int countYears (int todayYear) {
        if (todayYear > year)
            return todayYear - year;
        else {
            System.out.println ("Объект еще не построен");
            return 0;
        }
    }

}
