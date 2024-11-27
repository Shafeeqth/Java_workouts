package handlingExeption;


public class Handling {

    public static void main(String[] args) {

        int i = 55;
        int j = 0;
        Handling h = new Handling();

        if (h instanceof Handling) {
            System.out.println("h is instance of Handling class");
        }

        try {
            j = 50 / i;

        } catch (Exception e) {
            System.out.println("handling some random exception");
     
        }

        try {
            j = 50 / i;
            if(j == 0) {
                j = 18;
                throw new ArithmeticException("Quotient can't be 0");
            }
            System.out.println("Everything is ok");

        } catch (ArithmeticException e) {
            System.out.println("Found an Arithmetic exception :" + e);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Can't access out of index values " + e);

        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
        
        System.out.println("Program run smoothly \nwithout crash...");
        System.out.println("final value : " + j);




    }

}
