package OOP;

public class Main_dz2 {
    public static void main(String[] args) {
    House school = new House();
    House kidgarden = new House();

    school.set(4, 2015, "Школа");
    kidgarden.set(2, 2019, "Детский сад");

    school.printAll();
    kidgarden.printAll();

    System.out.println (school.countYears (2018));
    System.out.println (kidgarden.countYears (2018));
}

}
