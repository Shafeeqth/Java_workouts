
enum Enum {
    RUNNING, PENDING, SUCCESS, FAILED

}

enum Laptop {
    Macbook(150000), Thinkpad(58000), Surface(46000);

    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private Laptop(int price) {
        this.price = price;
    }
}

public class EnumDemo {
    public static void main(String[] args) {
        Laptop lap = Laptop.Macbook;
        System.out.println(lap);
        System.out.println(lap.ordinal());
        System.out.println(lap.getPrice()); 
        lap.setPrice(450000); 
        System.out.println(lap.getPrice()); 

        Enum en = Enum.PENDING;
        System.out.println(en + " : " + en.ordinal());
        System.out.println(en.getClass().getSuperclass());
        System.out.println(en.getClass().getSuperclass().getSuperclass());

        switch (en) {
            case SUCCESS:
                System.out.println("Done");
                break;
            case PENDING:
                System.out.println("please wait");
                break;
            case RUNNING:
                System.out.println("All well");
                break;
            default:
                System.out.println("Something went wrong");
                break;
        }

    }
}
