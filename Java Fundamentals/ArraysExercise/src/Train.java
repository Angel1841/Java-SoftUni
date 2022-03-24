import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int[] arr = new int[n];

        for(int i = 0; i<arr.length;i++){
            int number = Integer.parseInt(scanner.nextLine());
            arr[i] = number;
            sum+=arr[i];
        }

        for (var item: arr) {
            System.out.print(item + " ");
        }

        System.out.printf("\n%d",sum);
    }
}
