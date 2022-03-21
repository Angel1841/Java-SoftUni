import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        int courses = people / capacity;
        int s = 0;

        if(people < capacity){
            System.out.println("1");
            return;
        }
        if(people % capacity != 0){
            System.out.println(courses + 1);
        } else{
            System.out.println(courses);
        }

    }
}
