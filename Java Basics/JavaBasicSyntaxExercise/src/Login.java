import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String pas = "";

        for(int i = input.length() - 1;i>=0;i--){
            pas = pas + input.charAt(i);
        }

        String hacker = scanner.nextLine();
        int counter =0;

        while(!hacker.equals(pas)){
            counter++;
            if(counter == 4){
                System.out.printf("User %s blocked!",input);
                return;
            }   else{
                System.out.println("Incorrect password. Try again.");

            }
            hacker = scanner.nextLine();
        }


            System.out.printf("User %s logged in.",input);



    }
}
