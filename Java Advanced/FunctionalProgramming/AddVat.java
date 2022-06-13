import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class AddVat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        UnaryOperator<Double> vat = p -> p + p * 0.20;

        List<Double> prices = Arrays.stream(scanner.nextLine().split(", "))
                .map(Double::parseDouble)
                .map(vat)
                .collect(Collectors.toList());

        System.out.println("Prices with VAT:");

        Consumer<Double> output = p -> System.out.printf("%.2f%n",p);

        for (var item: prices) {
            output.accept(item);
        }

    }

}
