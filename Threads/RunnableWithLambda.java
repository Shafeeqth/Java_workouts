package Threads;

public class RunnableWithLambda {
    
    public static void main(String[] args) {
        
        Runnable r1 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello");
                try {Thread.sleep(200);} catch (InterruptedException e) { e.printStackTrace();  }
                
            }
        };
        Runnable r2 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hey..");
                try {Thread.sleep(200);} catch (InterruptedException e) { e.printStackTrace();  }
                
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        
        t1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        t2.start();
    }
    
}
