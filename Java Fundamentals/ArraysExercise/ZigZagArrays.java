import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] arr1 = new String[n];
        String[] arr2 = new String[n];

        for (int i = 1; i <= n; i++) {
            String[] line = scanner.nextLine().split(" ");
            if(i % 2 ==0){
                arr1[i-1] = line[1];
                arr2[i-1] = line[0];
            } else{
                arr1[i-1] = line[0];
                arr2[i-1] = line[1];
            }
        }

        for (var item : arr1) {
            System.out.print(item + " ");
        }

        System.out.println();

        for (var item : arr2) {
            System.out.print(item + " ");
        }


    }
}
