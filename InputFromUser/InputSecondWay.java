package InputFromUser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputSecondWay {
    public static void main(String[] args) {
        
        System.out.println("Enter a number");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);

        int number;
        try {
            number = Integer.parseInt(bf.readLine());
            System.out.println("You entered: " + number );
            bf.close();
            
        } catch (NumberFormatException | IOException e) {
            System.out.println(e);
            e.printStackTrace();
        }

    }
}
