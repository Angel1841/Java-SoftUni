import java.util.*;

public class OpinionRoll {


    static class Person{

        private String name;

        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return String.format("%s - %d",this.name,this.age);
        }


    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Person> people = new ArrayList<>();


        for (int i = 0; i < n; i++) {

            String input = scanner.nextLine();

            String[] tokens= input.split(" ");

            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);

            Person person = new Person(name,age);

            people.add(person);

        }

        people.stream().sorted((a1, a2) -> a1.getName().compareTo(a2.getName()))
                .filter(p -> p.getAge() > 30)
                .forEach(p -> System.out.println(p.toString()));


    }
}
