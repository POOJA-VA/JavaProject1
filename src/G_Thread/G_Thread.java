package G_Thread;

import java.sql.SQLOutput;

public class G_Thread extends Thread{

    public void run(){
        System.out.println("Running.....");
    }

    public static void main(String[] args) {
        G_Thread object = new G_Thread();
        object.start();
    }
}
