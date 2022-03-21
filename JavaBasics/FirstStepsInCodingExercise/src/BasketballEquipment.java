import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int tax = Integer.parseInt(scanner.nextLine());
        double sneakers = tax - (tax * 0.40);
        double equip = sneakers - (sneakers * 0.20);
        double ball = equip /4;
        double accessories = ball / 5;
        double sum = tax + sneakers + equip + ball + accessories;
        double total = sum * 100;
        System.out.println(total/100);
    }
}
