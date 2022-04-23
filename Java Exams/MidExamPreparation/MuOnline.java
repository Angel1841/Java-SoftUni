import java.util.Scanner;

public class MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int health = 100;
        int bitcoins = 0;
        int room = 0;

        String[] rooms = scanner.nextLine().split("\\|+");

            for (int j = 0; j < rooms.length; j++) {

                String[] tokens = rooms[j].split(" ");
                String command = tokens[0];

                switch(command){
                    case "potion":
                        int toHeal = Integer.parseInt(tokens[1]);
                        int temp = health;

                        health += toHeal;

                        if(health <= 100){

                            System.out.printf("You healed for %d hp.\n",toHeal);
                            System.out.printf("Current health: %d hp.\n",health);
                            room++;

                        break;

                        } else{
                            health = 100;
                            toHeal = 100 - temp;
                            System.out.printf("You healed for %d hp.\n",toHeal);
                            System.out.printf("Current health: %d hp.\n",health);
                            room++;
                            break;
                        }

                    case "chest":
                        int bitcoin = Integer.parseInt(tokens[1]);
                        bitcoins += bitcoin;
                        System.out.printf("You found %d bitcoins.\n",bitcoin);
                        room++;

                        break;

                    default:
                        String monster = tokens[0];
                        int damage = Integer.parseInt(tokens[1]);

                        health -= damage;

                        if(health <= 0){
                            room++;
                            System.out.printf("You died! Killed by %s.\n",monster);
                            System.out.printf("Best room: %d\n",room);
                            return;
                        } else{
                            System.out.printf("You slayed %s.\n",monster);
                            room++;
                        }
                        break;
                }
        }

            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d\n",bitcoins);
            System.out.printf("Health: %d\n",health);


    }
}
