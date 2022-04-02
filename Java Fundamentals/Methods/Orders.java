import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        switch(type){
            case "coffee":
                coffee(quantity);
                break;
            case "water":
                water(quantity);
                break;
            case "coke":
                coke(quantity);
                break;
            case "snacks":
                snacks(quantity);
        }

    }

    static void coffee(int a){
        System.out.printf("%.2f",a * 1.50);
    }

    static void water(int a){
        System.out.printf("%.2f",a * 1.00);
    }

    static void coke(int a){
        System.out.printf("%.2f",a * 1.40);
    }

    static void snacks(int a){
        System.out.printf("%.2f",a * 2.00);
    }
}