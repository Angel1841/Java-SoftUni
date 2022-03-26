import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grade = Double.parseDouble(scanner.nextLine());
        Grades(grade);
    }

    static void Grades(double grade) {
        if (grade <= 2.99 && grade >= 2) {
            System.out.println("Fail");
        }
        if (grade <= 3.49 && grade >= 3) {
            System.out.println("Poor");
        }
        if (grade <= 4.49 && grade >= 3.50) {
            System.out.println("Good");
        }
        if (grade <= 5.49 && grade >= 4.50) {
            System.out.println("Very good");
        }

        if (grade <= 6 && grade >= 5.50) {
            System.out.println("Excellent");
        }
    }
}
