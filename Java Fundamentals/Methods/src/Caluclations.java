import java.util.Scanner;

public class Caluclations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        switch(command){
            case "add":
                add(a,b);
                break;
            case "multiply":
                multiply(a,b);
                break;
            case "divide":
                divide(a,b);
                break;
            case "substract":
                substract(a,b);
                break;
        }

    }

    static void add(int a, int b){
        System.out.println(a+b);
    }

    static void multiply(int a, int b){
        System.out.println(a*b);
    }

    static void divide(int a, int b){
        System.out.println(a/b);
    }

    static void substract(int a,int b){
        System.out.println(a-b);
    }
}
