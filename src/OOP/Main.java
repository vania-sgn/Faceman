package OOP;

public class Main {
    public static void main(String[] args) {
        Transport bmw = new Transport();
        bmw.setValues(250,2400,"Black",new byte[]{100,0,100});
        String res1 = bmw.getValue();
        System.out.println(res1);
//        bmw.speed = 250.5f;
//        bmw.weight = 2400;
//        bmw.color = "black";
//        bmw.coordinate =new byte[] {0, 0, 0};

        Transport truck = new Transport();
        truck.speed = 70.5f;
        truck.weight = 7400;
        truck.color = "Red";
        truck.coordinate =new byte[] {100, 100, 0};
        String res2 = truck.getValue();
        System.out.println(res2);

        //System.out.println(" BMW SPEDD "+ bmw.speed + " Truck speed " + truck.speed);
    }

}
