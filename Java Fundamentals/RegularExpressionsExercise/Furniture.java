import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("[>]{2}(?<product>[\\w]+)[<]{2}(?<price>[\\d.]+)!(?<quantity>[\\d]+)");

        double sum = 0;
        List<String> bought = new ArrayList<>();

        while(!input.equals("Purchase")){

            Matcher matcher = pattern.matcher(input);

            while(matcher.find()){

                String product = matcher.group("product");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));

                sum += price * quantity;

                bought.add(product);

            }

            input = scanner.nextLine();

        }

        System.out.println("Bought furniture:");
        bought.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f",sum);

    }
}
