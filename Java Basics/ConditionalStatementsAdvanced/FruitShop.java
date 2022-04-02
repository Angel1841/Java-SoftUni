import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0;

        if(day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday")
                || day.equals("Thursday") || day.equals("Friday")){
            if(fruit.equals("banana")){
                price = quantity * 2.50;
                System.out.printf("%.2f",price);
            } else if(fruit.equals("apple")){
                price = quantity * 1.20;
                System.out.printf("%.2f",price);
            } else if(fruit.equals("orange")){
                price = quantity * 0.85;
                System.out.printf("%.2f",price);
            } else if(fruit.equals("grapefruit")){
                price = quantity * 1.45;
                System.out.printf("%.2f",price);
            } else if(fruit.equals("kiwi")){
                price = quantity * 2.70;
                System.out.printf("%.2f",price);
            } else if(fruit.equals("pineapple")){
                price = quantity * 5.50;
                System.out.printf("%.2f",price);
            } else if(fruit.equals("grapes")){
                price = quantity * 3.85;
                System.out.printf("%.2f",price);
            }else{
                System.out.println("error");
        }
        }
        else if(day.equals("Saturday") || day.equals("Sunday")){
            if(fruit.equals("banana")){
                price = quantity * 2.70;
                System.out.printf("%.2f",price);
            } else if(fruit.equals("apple")){
                price = quantity * 1.25;
                System.out.printf("%.2f",price);
            } else if(fruit.equals("orange")){
                price = quantity * 0.90;
                System.out.printf("%.2f",price);
            } else if(fruit.equals("grapefruit")){
                price = quantity * 1.60;
                System.out.printf("%.2f",price);
            } else if(fruit.equals("kiwi")){
                price = quantity * 3.00;
                System.out.printf("%.2f",price);
            } else if(fruit.equals("pineapple")){
                price = quantity * 5.60;
                System.out.printf("%.2f",price);
            } else if(fruit.equals("grapes")){
                price = quantity * 4.20;
                System.out.printf("%.2f",price);
            }
        }
        else{
            System.out.println("error");
        }
    }
}