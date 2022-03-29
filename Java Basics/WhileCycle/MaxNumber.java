import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int max = Integer.MIN_VALUE;


        while(!input.equals("Stop")){
            int n = Integer.parseInt(input);
            if(n > max){
                max = n;
            }
            input = scanner.nextLine();
        }
        System.out.println(max);
    }
}
