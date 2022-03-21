import java.util.Scanner;

public class HairSalon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int goal = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        boolean isReached = false;

        String input = scanner.nextLine();

        while(!input.equals("closed")){

            if(input.equals("haircut")){
                String type = scanner.nextLine();
                if(type.equals("mens")){
                    sum += 15;
                }
                if(type.equals("ladies")){
                    sum += 20;
                }
                if(type.equals("kids")){
                    sum += 10;
                }

                if(sum >= goal){
                    isReached = true;
                    break;
                }
            }

            if(input.equals("color")){
                String typeColor = scanner.nextLine();
                if(typeColor.equals("touch up")){
                    sum += 20;
                }
                if(typeColor.equals("full color")){
                    sum += 30;
                }
                if(sum >= goal){
                    isReached = true;
                    break;
                }
            }

            input = scanner.nextLine();
        }

        if(isReached){
            System.out.printf("You have reached your target for the day!\n" +
                    "Earned money: %dlv.",sum);
        }else{
            System.out.printf("Target not reached! You need %dlv. more.\n" +
                    "Earned money: %dlv.",goal - sum,sum);
        }
    }
}
