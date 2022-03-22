import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        if(town.equals("Sofia")){
            if(product.equals("coffee")){
               double coffee = 0.50 * quantity;
                System.out.println(coffee);
            } else if(product.equals("water")){
               double water = 0.80 * quantity;
                System.out.println(water);
            } else if(product.equals("beer")){
               double beer = 1.20 * quantity;
                System.out.println(beer);
            } else if(product.equals("sweets")){
               double sweets = 1.45 * quantity;
                System.out.println(sweets);
            } else if(product.equals("peanuts")){
               double peanuts = 1.60 * quantity;
                System.out.println(peanuts);
            }
        } else if(town.equals("Plovdiv")){
            if(product.equals("coffee")){
                double coffee = 0.40 * quantity;
                System.out.println(coffee);
            } else if(product.equals("water")){
                double water = 0.70 * quantity;
                System.out.println(water);
            } else if(product.equals("beer")){
                double beer = 1.15 * quantity;
                System.out.println(beer);
            } else if(product.equals("sweets")){
                double sweets = 1.30 * quantity;
                System.out.println(sweets);
            } else if(product.equals("peanuts")){
                double peanuts = 1.50 * quantity;
                System.out.println(peanuts);
            }

        } else if(town.equals("Varna")){
            if(product.equals("coffee")){
                double coffee = 0.45 * quantity;
                System.out.println(coffee);
            } else if(product.equals("water")){
                double water = 0.70 * quantity;
                System.out.println(water);
            } else if(product.equals("beer")){
                double beer = 1.10 * quantity;
                System.out.println(beer);
            } else if(product.equals("sweets")){
                double sweets = 1.35 * quantity;
                System.out.println(sweets);
            } else if(product.equals("peanuts")){
                double peanuts = 1.55 * quantity;
                System.out.println(peanuts);
            }

        }
    }
}
