import java.util.Scanner;

public class SoftuniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int effiencyOne = Integer.parseInt(scanner.nextLine());
        int effiencyTwo = Integer.parseInt(scanner.nextLine());
        int effiencyThree = Integer.parseInt(scanner.nextLine());

        long students = Long.parseLong(scanner.nextLine());

        int limit = effiencyOne + effiencyTwo + effiencyThree;

        int hours = 0;

        while(students > 0){

            students = students - limit;
            hours++;

            if(hours % 4 == 0){
                hours++;
            }
        }

        System.out.printf("Time needed: %dh.",hours);
    }
}
