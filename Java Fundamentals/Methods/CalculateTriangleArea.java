import java.util.Scanner;

public class CalculateTriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        Area(a,b);
    }

    static void Area(int a, int b){
        System.out.println(a*b);
    }
}
