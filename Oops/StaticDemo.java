package Oops;

class Person {

    String name;
    int age;
    static String genus = "Homo"; // Static member / property
    static int count;

    // Static block
    static {
        count = 0;
        System.out.println("class instantiated");

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        count += 1;
        System.out.println("object instantiated");

    }

    public void printDetails() {
        System.out.println("Name: " + name + "Age: " + age);
    }

}

public class StaticDemo {

    public static void main(String[] args) {

        Person person1 = new Person("Naji", 20);

        // Class.forName("Person");

        person1.printDetails();
        System.out.println(Person.count);


    }

}
