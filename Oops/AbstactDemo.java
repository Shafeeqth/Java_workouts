package Oops;


abstract class Car {
    public abstract void drive();
    public abstract void applyBreak();


    public void playMusic()  {
        System.out.println("Playing music");
    }
}

abstract class Benz extends Car {

    public void drive() {
        System.out.println("Driving Benz car");
    }

}

class UpdatedBenz extends Benz {
    public void applyBreak() {
        System.out.println("Break got applied");
    }

    
}


public class AbstactDemo {
    public static void main(String[] args) {
        Car benz = new UpdatedBenz();
        benz.applyBreak();
        benz.drive();
        benz.playMusic();
        
    }
    
}
