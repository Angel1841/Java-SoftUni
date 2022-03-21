import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double points = Double.parseDouble(scanner.nextLine());
        int jury = Integer.parseInt(scanner.nextLine());


        for(int i = 1; i <= jury;i++){

            String juryName = scanner.nextLine();
            double juryPoints = Double.parseDouble(scanner.nextLine());

            points = points + ((juryName.length() * juryPoints)/2);

            if(points >= 1250.5){
                break;
            }
        }

        if(points >= 1250.5){
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!",actorName, points);
        } else{
            System.out.printf("Sorry, %s you need %.1f more!",actorName, 1250.5 - points);
        }



    }
}
