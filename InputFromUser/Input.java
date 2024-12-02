package InputFromUser;

import java.io.IOException;

public class Input {
    public static void main(String[] args) {
        try {
            System.out.println("Enter a number");
            int num = System.in.read();
            System.out.println(num);
            System.out.println(num - 48);
            System.out.println((int)'0');
            




        } catch (IOException e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
    
}
