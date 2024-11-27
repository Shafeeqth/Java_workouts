@FunctionalInterface
interface A {
    public abstract void doSomething();
}

class B implements A {
    public void doSomething() {
        System.out.println("inside B doSomething");

    }
}


public class FunctionalInterfaces {
    public static void main(String[] args) {
        B b = new B();
        b.doSomething();

        A a = new A() {
            public void doSomething() {
                System.out.println("Inside inner anonymous class");
            };
        };

        a.doSomething();

        A aa = () -> System.out.println("I am a lambda expression");
        A al = () -> {
            System.out.println(
            """
            It is a lambda expression which can only be 
            used with functional interfaces 
            """ );
        };

        aa.doSomething();
        al.doSomething();
        
    }
    
}
