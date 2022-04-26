import java.util.Scanner;

public class SpaceTravel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] route = scanner.nextLine().split("\\|\\|");

        int fuel = Integer.parseInt(scanner.nextLine());
        int ammunition = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < route.length; i++) {

            String[] tokens = route[i].split(" ");
            String command = tokens[0];

            switch (command){
                case"Travel":
                    int lightYears = Integer.parseInt(tokens[1]);

                    if(fuel >= lightYears) {
                        System.out.printf("The spaceship travelled %d light-years.\n",lightYears);
                        fuel -= lightYears;
                    }

                    else{
                        System.out.println("Mission failed.");
                        return;
                    }

                break;

                case "Enemy":
                    int enemyArmour = Integer.parseInt(tokens[1]);

                    if(ammunition >= enemyArmour){
                        ammunition -= enemyArmour;
                        System.out.printf("An enemy with %d armour is defeated.\n",enemyArmour);
                    } else{

                        if(enemyArmour * 2 <= fuel){
                            fuel -= enemyArmour * 2;
                            System.out.printf("An enemy with %d armour is outmaneuvered.\n",enemyArmour);
                        } else {
                            System.out.println("Mission failed.");
                            return;

                        }
                    }

                    break;

                case "Repair":
                    int added = Integer.parseInt(tokens[1]);

                    fuel += added;
                    ammunition += added * 2;

                    System.out.printf("Ammunitions added: %d.\n",added * 2);
                    System.out.printf("Fuel added: %d.\n",added);

                break;

                case "Titan":
                    if(fuel > 0){
                        System.out.println("You have reached Titan, all passengers are safe.");
                    }
                    break;
            }

        }
    }
}
