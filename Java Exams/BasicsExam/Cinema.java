import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = Integer.parseInt(scanner.nextLine());
        int people1 = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        boolean isFull = false;
        int peopleSum = people1;
        int begginerTicketSum = 5 * people1;
        int enteringTicketSum = 0;



        while(!input.equals("Movie time!")){

            int people2 = Integer.parseInt(input);

            peopleSum += people2;

            enteringTicketSum = enteringTicketSum + (people2 * 5);

            if(people2 % 3 == 0){
                enteringTicketSum = enteringTicketSum - 5;
            }

            if(capacity < peopleSum){
                isFull = true;
                break;
            }

            input = scanner.nextLine();
        }



        if(isFull){
            System.out.printf("The cinema is full.\nCinema income - %d lv.",enteringTicketSum + begginerTicketSum);
        } else{
            System.out.printf("There are %d seats left in the cinema.\nCinema income - %d lv.",capacity - peopleSum,enteringTicketSum + begginerTicketSum);
        }
    }
}
