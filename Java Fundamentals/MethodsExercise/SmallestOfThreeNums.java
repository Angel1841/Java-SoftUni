import java.util.Scanner;

public class SmallestOfThreeNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        LowestNum(a,b,c);

    }

    static void LowestNum(int a, int b, int c){
        System.out.println(Math.min(Math.min(a, b), c));
    }
}
