package D_Override;

public class Vehicle {
    public Vehicle(){
        System.out.println("Information About Vehicle");
    }
    int wheels = 4;
    void getColor(){
        System.out.println("Blue");
    }

    void getWheels(){
        System.out.println("Wheels" +wheels);
    }
}
