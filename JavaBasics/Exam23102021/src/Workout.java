import java.util.Scanner;

public class Workout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double m = Double.parseDouble(scanner.nextLine());
        double kmSum = m;

        for(int i =0; i<n;i++){
            double increase = Integer.parseInt(scanner.nextLine());
            double percents = increase / 100;
            m = m + (m * percents);
            kmSum += m;
        }

        if(kmSum >= 1000){
            System.out.printf("You've done a great job running %.0f more kilometers!",Math.ceil(kmSum - 1000));
        }else{
            System.out.printf("Sorry Mrs. Ivanova, you need to run %.0f more kilometers",Math.ceil(1000 - kmSum));
        }
    }
}
