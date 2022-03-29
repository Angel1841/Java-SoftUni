import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double budget = 0;

        while (!input.equals("Start")) {
            double coins = Double.parseDouble(input);

            if(coins != 0.1 && coins != 0.2 && coins != 0.5 && coins != 1 && coins != 2)
            {
                System.out.printf("Cannot accept %.2f%n",coins);
            }
            else{
                budget += coins;
            }

            input = scanner.nextLine();
        }

        String product = scanner.nextLine();

        while(!product.equals("End")){

            if(!product.equals("Nuts") && !product.equals("Soda") && !product.equals("Coke") && !product.equals("Water") && !product.equals("Crisps"))
            {
                System.out.println("Invalid product");
            }
            else{
                if(product.equals("Nuts")){
                    if(budget >= 2){
                        budget -= 2;
                        System.out.println("Purchased Nuts");
                    } else{
                        System.out.println("Sorry, not enough money");
                    }
                }

                if(product.equals("Water")){
                    if(budget >= 0.7){
                        budget -= 0.7;
                        System.out.println("Purchased Water");
                    } else{
                        System.out.println("Sorry, not enough money");
                    }
                }

                if(product.equals("Crisps")){
                    if(budget >= 1.5){
                        budget -= 1.5;
                        System.out.println("Purchased Crisps");
                    } else{
                        System.out.println("Sorry, not enough money");
                    }
                }

                if(product.equals("Soda")){
                    if(budget >= 0.8){
                        budget -= 0.8;
                        System.out.println("Purchased Soda");
                    } else{
                        System.out.println("Sorry, not enough money");
                    }
                }

                if(product.equals("Coke")){
                    if(budget >= 1.0){
                        budget -= 1.0;
                        System.out.println("Purchased Coke");
                    } else{
                        System.out.println("Sorry, not enough money");
                    }
                }

            }
            product = scanner.nextLine();
        }
        System.out.printf("Change: %.2f",budget);
    }
}
