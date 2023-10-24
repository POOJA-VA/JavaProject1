package B_Class;

import java.sql.SQLOutput;

public class B_Class {

    void hello() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        B_Class object = new B_Class();
        object.hello();

        demo createHai = new demo();
        createHai.hai();
    }
}

class demo {
    void hai() {
        System.out.println("Hai");
    }
}
