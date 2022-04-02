import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int temperature = Integer.parseInt(scanner.nextLine());
        String time = scanner.nextLine();

        if (temperature >= 10 && temperature <= 18) {
            if (time.equals("Morning")) {
                System.out.printf("It's %d degrees, get your Sweatshirt and Sneakers.", temperature);
            } else if (time.equals("Afternoon") || time.equals("Evening")) {
                System.out.printf("It's %d degrees, get your Shirt and Moccasins.", temperature);
            }
        }

        if (temperature > 18 && temperature <= 24) {
            if (time.equals("Morning") || time.equals("Evening")) {
                System.out.printf("It's %d degrees, get your Shirt and Moccasins.", temperature);
            }else if (time.equals("Afternoon")) {
                    System.out.printf("It's %d degrees, get your T-Shirt and Sandals.", temperature);
        }

        } if (temperature >= 25) {
            if (time.equals("Morning")) {
                System.out.printf("It's %d degrees, get your T-Shirt and Sandals.", temperature);
            } else if(time.equals("Afternoon")){
                System.out.printf("It's %d degrees, get your Swim Suit and Barefoot.", temperature);
            } else if(time.equals("Evening")){
                System.out.printf("It's %d degrees, get your Shirt and Moccasins.", temperature);
            }
        }

    }
}
