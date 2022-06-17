import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class AppliedArithmetics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> input = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        UnaryOperator<List<Integer>> addFunction = list -> list.stream().map(e -> e+1).collect(Collectors.toList());
        UnaryOperator<List<Integer>> substractFunction = list -> list.stream().map(e -> e-1).collect(Collectors.toList());
        UnaryOperator<List<Integer>> multiplyFunction = list -> list.stream().map(e -> e*2).collect(Collectors.toList());

        String command = scanner.nextLine();

        while(!command.equals("end")) {
            switch (command) {
                case "add":
                    input = addFunction.apply(input);
                    break;

                case "subtract":
                    input = substractFunction.apply(input);
                    break;

                case "mulitply":
                    input = multiplyFunction.apply(input);
                    break;

                case "print":
                    input.forEach(p -> System.out.print(p + " "));
                    System.out.println();
                    break;

            }

            command = scanner.nextLine();
        }

    }
}
