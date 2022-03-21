import java.util.Scanner;

public class FORECAST {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String weather = scanner.nextLine();
        switch(weather){
            case "sunny":
                System.out.println("its warm outside!");
                break;
            default:
                System.out.println("It's cold outside!");
        }

    }
}


