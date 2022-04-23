import java.util.Scanner;

public class BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var num = Double.parseDouble(scanner.nextLine());
        var lecture = Double.parseDouble(scanner.nextLine());
        var bonus = Double.parseDouble(scanner.nextLine());

        double max = 0;
        double maxAttendence = 0;

        for (int i = 0; i < num; i++) {

            int attendence = Integer.parseInt(scanner.nextLine());

            double totalBonus = Math.ceil((attendence / lecture) * (bonus + 5));

            if(totalBonus > max){
                max = totalBonus;
                maxAttendence = attendence;
            }

        }

        System.out.printf("Max Bonus: %.0f.\nThe student has attended %.0f lectures.",max,maxAttendence);
    }
}
