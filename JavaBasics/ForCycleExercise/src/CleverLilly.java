import java.util.Scanner;

public class CleverLilly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double washingMachine = Double.parseDouble(scanner.nextLine());
        int pricePerToy = Integer.parseInt(scanner.nextLine());

        int toy = 0;
        int savedMoney = 0;
        int money = 10;

        for(int i = 1; i <= age;i++){
            if(i % 2 == 0){
                    savedMoney = savedMoney + money;
                    money += 10;
                    savedMoney = savedMoney - 1;
            }else{
                toy++;
            }
        }

        int moneyFromToys = toy * pricePerToy;

        int allMoney = moneyFromToys + savedMoney;

        if(allMoney<washingMachine){
            System.out.printf("No! %.2f", washingMachine - allMoney);
        }else{
            System.out.printf("Yes! %.2f", allMoney - washingMachine);
        }



    }
}
