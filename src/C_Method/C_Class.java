package C_Method;

public class C_Class {
    void display() {
        System.out.println("Welcome to the class");
    }

    void method(String msg){
        System.out.println(msg);
    }

    static int addition(){
        return 7+4;
    }

    public static void main(String[] args)
    {
        C_Class object = new C_Class();
        object.display();
        object.method("Hai...Hello...");
        object.method("Hai! This is pooja");

        int sum = C_Class.addition();
        System.out.println("The added number is:" +sum);
    }
}