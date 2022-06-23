import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<Integer, BankAccount> mapper = new HashMap<>();

        while(!input.equals("End")){

            String[] tokens = input.split(" ");

            String command = tokens[0];

            switch (command){

                case"Create":

                    BankAccount bankAcc = new BankAccount();
                    int key = bankAcc.getId();
                    mapper.put(key, bankAcc);

                    System.out.printf("Account ID%d created%n",key);

                    break;

                case"Deposit":

                    int numberAcc = Integer.parseInt(tokens[1]);
                    int amount = Integer.parseInt(tokens[2]);

                    if(mapper.containsKey(numberAcc)){

                        mapper.get(numberAcc).deposit(amount);

                        System.out.printf("Deposited %d to ID%d%n",amount, numberAcc);

                    } else{
                        System.out.println("Account does not exist");
                    }

                    break;

                case"SetInterest":

                    double newInterest = Double.parseDouble(tokens[1]);

                    BankAccount.setInterestRate(newInterest);

                    break;

                case"GetInterest":

                    int wantedAcc = Integer.parseInt(tokens[1]);
                    int years = Integer.parseInt(tokens[2]);

                    if(mapper.containsKey(wantedAcc)) {
                        System.out.printf("%.2f%n", mapper.get(wantedAcc).getInterestRate(years));
                    }  else{
                        System.out.println("Account does not exist");
                    }

                    break;
            }

            input = scanner.nextLine();

        }

    }
}
