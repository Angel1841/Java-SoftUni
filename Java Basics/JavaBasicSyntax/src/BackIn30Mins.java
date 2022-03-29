import java.util.Scanner;

public class BackIn30Mins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int mins = Integer.parseInt(scanner.nextLine());

        if (mins < 30) {
            mins += 30;
        } else if (mins > 30) {
            mins -= 30;
            hours++;
        }

        if(hours > 23){
            hours = 0;
        }

        System.out.printf("%d:%02d",hours,mins);
    }
}
