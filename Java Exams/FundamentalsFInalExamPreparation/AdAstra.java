import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("([#|])(?<item>[A-Za-z ]+)\\1(?<date>\\d{2}\\/\\d{2}\\/\\d{2})\\1(?<calories>\\d{1,5})\\1");

        Matcher matcher = pattern.matcher(input);

        int allCalories = 0;

        List<String> items = new ArrayList<>();

        while(matcher.find()){

            String item = matcher.group("item");
            String date = matcher.group("date");
            int calories = Integer.parseInt(matcher.group("calories"));

            allCalories += calories;

            items.add(String.format("Item: %s, Best before: %s, Nutrition: %d",
                    item, date, calories));
        }

        int days = allCalories / 2000;

        if(days > 0){

            System.out.printf("You have food to last you for: %d days!%n",days);

            items.forEach(System.out::println);

        } else {
            System.out.println("You have food to last you for: 0 days!");
        }


    }
}
