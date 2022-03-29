import java.util.Scanner;

public class MInNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        String input = scanner.nextLine();

        while(!input.equals("Stop")){
            int n = Integer.parseInt(input);
            if(min>n){
                min = n;
            }
            input = scanner.nextLine();
        }
        System.out.println(min);

    }
}
