package A_Object;

public class A_Object {
    String firstName = "Pooja";
    int age;

    public static void main(String[] args) {
        A_Object object = new A_Object();
        System.out.println(object);
        System.out.println(object.firstName);

        A_Object objectTwo = new A_Object();
        System.out.println(objectTwo);
        System.out.println(object.firstName);
    }
}