import java.util.Scanner;

public class GreatestOfTwoValues {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        switch (input) {
            case "int":

                int first = Integer.parseInt(scanner.nextLine());
                int second = Integer.parseInt(scanner.nextLine());

                getMaxInt(first, second);
                break;

            case "char":
                char char1 = scanner.next().charAt(0);
                char char2 = scanner.next().charAt(0);

                getMaxChar(char1,char2);
                break;

            case "string":
                String input1 = scanner.nextLine();
                String input2 = scanner.nextLine();
                getMaxString(input1,input2);
                break;
        }

    }

    static void getMaxInt(int a, int b) {
        System.out.println(Math.max(a, b));
    }

    static void getMaxChar(char a, char b) {
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }

    static void getMaxString(String a, String b) {

        if (a.compareTo(b) >= 0) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }


}
