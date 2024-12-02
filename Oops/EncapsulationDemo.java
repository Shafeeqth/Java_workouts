package Oops;

class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;

    }

    public void setAge(int age) {
        this.age = age;

    }

}

public class EncapsulationDemo {
    public static void main(String[] args) {
    
        Person person1 = new Person();
        person1.setAge(23);
        person1.setName("Shafeeque");

        System.out.println("Name: " + person1.getName() + " Age: " + person1.getAge());

    
    }

}
