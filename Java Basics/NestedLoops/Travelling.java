import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String destination = scanner.nextLine();

        while(!destination.equals("End")){
            double sum = Double.parseDouble(scanner.nextLine());
            double savedMoney = 0;

            while(savedMoney < sum){
                double money = Double.parseDouble(scanner.nextLine());
                savedMoney = savedMoney + money;
            }
            System.out.printf("Going to %s!",destination);

            destination = scanner.nextLine();
        }

    }
}
