import java.util.Scanner;

public class FruitOrVegetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();

        if(fruit.equals("banana") || fruit.equals("apple") || fruit.equals("kiwi") ||
                fruit.equals("cherry") ||  fruit.equals("lemon") ||  fruit.equals("grapes")){
            System.out.println("fruit");
        }else if(fruit.equals("tomato") || fruit.equals("cucumber") || fruit.equals("pepper") ||
                fruit.equals("carrot")){
            System.out.println("vegetable");
        } else System.out.println("unknown");
    }
}
