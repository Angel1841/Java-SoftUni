import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EnterNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        int start = 1;

        while(numbers.size() < 10){

           int num;

            try{
                num = numParser(start,scanner);
            } catch(IllegalStateException e){
                System.out.println(e.getMessage());
                continue;
            }

            start = num;
            numbers.add(num);

        }

        System.out.println(numbers.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", ")));

    }

    public static int numParser(int start, Scanner scanner) {

        String input = scanner.nextLine();

        int num;

        try {
            num = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalStateException("Invalid Number!");
        }

        if (num <= start || num >= 100) {
            throw new IllegalStateException("Your number is not in range " + start + " - 100!");
        }

        return num;
    }
}
