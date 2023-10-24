package D_Override;

public class Main {
    public static void main(String[] args) {
        Vehicle object =  new Vehicle();
        object.getWheels();
        object.getColor();

        car object1 = new car();
        object1.getWheels();
        object1.getColor();

        car object3 = new car();
        car object2 = (car) object3;
        object2.getWheels();
        object2.getColor();
    }
}