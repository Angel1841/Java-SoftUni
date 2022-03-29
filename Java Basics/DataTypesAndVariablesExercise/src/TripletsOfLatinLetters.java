import java.util.Scanner;

public class TripletsOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (char i = 'a'; i < 'a' + number; i++)
        {

            for (char k = 'a'; k < 'a' + number; k++)
            {


                for (char l = 'a'; l < 'a' + number; l++)
                {
                    System.out.print(i);
                    System.out.print(k);
                    System.out.print(l);
                    System.out.println();
                }

            }

        }
    }
}
