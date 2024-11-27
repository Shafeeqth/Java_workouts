package handlingExeption;

class Demo {
    public void doSomething() throws ClassNotFoundException {
        System.out.println(Class.forName("NoClass"));
    }
}

public class ThrowsDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        Demo d = new Demo();
        d.doSomething();
        
    }
    
}
