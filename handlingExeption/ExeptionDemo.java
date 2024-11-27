package handlingExeption;

public class ExeptionDemo {
    public static void main(String[] args) {
        try {
            System.out.println("please enter a number");
            Integer num = System.in.read();

            System.out.println(num.toString());
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
