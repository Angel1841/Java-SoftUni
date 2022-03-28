import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        isDivisible(n);

    }


    public static void isDivisible(int n) {
        int sum = 0;
        int oddCounter = 0;

        for (int i = 0; i < n; i++) {
            int length = String.valueOf(i).length();

            int number = i;
            int solo = i;


            for (int j = 0; j < length; j++) {
                //SUM OF DIGITS CHECKER AND ODD CHECKER
                sum += number % 10;
                number /= 10;
            }



            for (int k = 0; k < length; k++) {
                //ODD CHECKER
                if((solo % 10) % 2 != 0){
                    oddCounter++;
                }
                solo /= 10;
            }



            if (sum % 8 == 0 && oddCounter >= 1) {
                System.out.println(i);
            }

         sum = 0;
         oddCounter = 0;
        }
    }

}
