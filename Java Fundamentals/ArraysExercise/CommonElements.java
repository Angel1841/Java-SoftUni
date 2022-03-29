import java.util.Arrays;
import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr1 = scanner.nextLine().split(" ");
        String[] arr2 = scanner.nextLine().split(" ");

        for (var element : arr2) {
            for (var element2 : arr1) {
                if(element.equals(element2)){
                    System.out.print(element + " ");
                }
            }
        }


    }
}
