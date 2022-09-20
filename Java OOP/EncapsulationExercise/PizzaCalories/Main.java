package PizzaCalories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        try {
            Pizza pizza = new Pizza(input[1], Integer.parseInt(input[2]));

            String[] doughs = scanner.nextLine().split(" ");
            Dough dough = new Dough(doughs[1], doughs[2], Double.parseDouble(doughs[3]));
            pizza.setDough(dough);

            String[] toppings = scanner.nextLine().split(" ");

            while (!"END".equals(toppings[0])) {
                Topping topping = new Topping(toppings[1], Double.parseDouble(toppings[2]));
                pizza.addTopping(topping);
                toppings = scanner.nextLine().split(" ");
            }

            System.out.printf("%s - %.2f", pizza.getName(), pizza.getOverallCalories());

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
