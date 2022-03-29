import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int years = 0;
        int badyear = 0;
        double average = 0;

        while (years < 12) {
            double grade = Double.parseDouble(scanner.nextLine());
            average += grade;
            if(grade< 4){
                badyear++;
            }

            if (badyear > 1) {
                System.out.printf("%s has been excluded at %d grade",name,years);
                break;
            }
            years++;
        }

        if(years == 12){
            double averageGrade = average / years;
            System.out.printf("%s graduated. Average grade: %.2f", name, averageGrade);
        }

    }
}
