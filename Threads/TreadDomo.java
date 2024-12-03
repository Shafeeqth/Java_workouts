package Threads;

class A extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {

            System.out.println("Hello there..");
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {e.printStackTrace();}
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {

            System.out.println("Hey there..");
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {e.printStackTrace();}
       
        }
    }
}

public class TreadDomo {

    public static void main(String[] args) {
        
        A a = new A();
        B b = new B();
        System.out.println(a.getPriority());
        b.setPriority(Thread.MAX_PRIORITY);

        a.start();
        
        b.start();

    }

}
