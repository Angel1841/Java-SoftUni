import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterByAge {

    public static class People{

        String name;
        int age;

        public People(String name, int age) {
            this.name = name;
            this.age = age;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<People> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            people.add(readPerson(scanner));
        }

        String ageCond = scanner.nextLine();
        int ageFilter = Integer.parseInt(scanner.nextLine());
        String outputFormat = scanner.nextLine();

        people = filterAgeByCond(people, getPredicate(ageCond,ageFilter));

        Consumer<People> printer = getPrinter(outputFormat);

        people.forEach(printer);

    }

    private static Consumer<People> getPrinter(String outputFormat) {
        switch (outputFormat){

            case"name":
                return p -> System.out.println(p.name);

            case"age":
                return p -> System.out.println(p.age);

            case"name age":
                return p -> System.out.println(p.name + " - " + p.age);

            default:
            throw new IllegalArgumentException("Unknown format " + outputFormat);
        }
    }

    private static Predicate<People> getPredicate(String ageCond, int ageFilter) {
        switch (ageCond){

            case "older":
                    return p -> p.age >= ageFilter;

            case "younger":
                    return p -> p.age <= ageFilter;

            default:
                throw new IllegalArgumentException("Invalid parameters for age predicate " + ageCond + " " + ageFilter);

        }
    }

    private static List<People> filterAgeByCond(List<People> people, Predicate<People> predicate) {
        return people.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }

    public static People readPerson(Scanner scanner){

        String[] tokens = scanner.nextLine().split(", ");

        String name = tokens[0];
        int age = Integer.parseInt(tokens[1]);

        return new People(name, age);


    }
}
