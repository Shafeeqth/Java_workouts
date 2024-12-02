package Oops;

class AA {
    protected String name;
    public void print() {
        System.out.println("inside A");
    }

    static class StaticClass {
        String str = "inside inner static  A class";
        

    }

    class InnerClass1 {
        String str = "inside Inner class";
        
    }
    
}

public class InnerClass {
    public static void main(String[] args) {

        AA obj = new AA();
        obj.print();
        AA.InnerClass1 inner = obj.new InnerClass1();
        System.out.println(inner.str);
        AA.StaticClass innerStatic = new AA.StaticClass();
        System.out.println(innerStatic.str);

        
    }

    
}