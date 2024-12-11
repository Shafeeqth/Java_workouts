package Oops;

class A {

    public A() {
        super();  // Object class
        System.out.println("Default A constructor");
    }

    public A(int a) {
        this();
        System.out.println("int constructor A ");

    }

}

class B extends A {
    public B() {
        super();
        System.out.println("Default B constructor");
    }

    public B(int a) {
        super(a);
        System.out.println("int B constructor");
    }
}

public class ConstructerDemo {

    public static void main(String[] args) {
        B b = new B();
        B b1 = new B(4);


    }

}
