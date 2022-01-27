package OOP;

    public class Transport_1 {
        public float speed;
        public int weight;
        public String color;
        public byte[] coordinate;

    public Transport_1(float _speed, int _weight, String _color, byte[] _coordinate){
        System.out.println("dvdvd");

        setValues(_speed, _weight, _color, _coordinate);
        System.out.println(getValue());
    }

    public void setValues(float _speed, int _weight, String _color, byte[] _coordinate){
        speed = _speed;
        weight = _weight;
        color = _color;
        coordinate = _coordinate;
    }


    public String getValue(){
        String info = "Object speed -"+ speed+". weight "+ weight + ". Color " + color +"\n" ;
        String infoCoordinate = " Coordinate \n";
        for (int i = 0; i < coordinate.length ; i++) {
            infoCoordinate += coordinate[i] + "\n";

        }
        return info + infoCoordinate;
    }
    }