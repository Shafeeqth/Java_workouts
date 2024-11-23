package packages;

import packages.one.*;

public class Main extends A {
    public void print() {
        System.out.println(this.department + " " + this.place);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.print();

    }

}
