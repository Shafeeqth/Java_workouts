package packages.two;

import packages.one.A;

class B extends A {
    int num1;
    int num2;
    
    public final void name() {

    }

    public void print() {
        System.out.println(this.place);
    }
    public B() {}

    public B(int n1, int n2) {
        this.num1 = n1;
        this.num2 = n2;

        B obj = add(this, 5, 8);
        System.out.println(obj.num1);
        System.out.println(obj.num2);


    }
    
    public B getObj() {
        return this;
    }

    private B add(B obj, int n1, int n2) {
        obj.num1 += n1;
        obj.num2 += n2;
        return obj;

    } 

}

class Child extends B {
    public Child() {

    }
    

}



public class Main {
    
    
    public static void main(String[] args) {
        B b = new B(3, 5) ;
        B obj = b.getObj();
        System.out.println(obj);
        System.out.println(b.department);
        b.print();

        
        
    }
}
