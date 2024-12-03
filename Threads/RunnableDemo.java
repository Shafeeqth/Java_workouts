package Threads;

class A implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {

            System.out.println("Hello there..");
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {e.printStackTrace();}
        }
    }
}

class B implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {

            System.out.println("Hey there..");
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {e.printStackTrace();}
       
        }
    }
}

public class RunnableDemo {

    public static void main(String[] args) {
        
        A a = new A();
        B b = new B();

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
       

        t1.start();
        
        t2.start();

    }

}
