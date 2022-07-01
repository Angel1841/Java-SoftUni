package OpinionPool;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> people = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n ; i++) {

            String[] input = scanner.nextLine().split(" ");

            String name = input[0];
            int age = Integer.parseInt(input[1]);

            Person p = new Person(name, age);

            people.add(p);

        }

        List<Person> sorted = people.stream().filter(p -> p.getAge() > 30).sorted(Comparator.comparing(Person::getName)).collect(Collectors.toList());

        for (var person: sorted) {
            System.out.printf("%s - %d%n",person.getName(),person.getAge());
        }
    }
}
