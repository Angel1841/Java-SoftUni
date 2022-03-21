import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int capacity = 255;
        int capacityleft = capacity;


        for(int i=0;i<n;i++) {
            int water = Integer.parseInt(scanner.nextLine());

            if(capacityleft - water >= 0){
                capacityleft -= water;
            }

            else{
                System.out.println("Insufficient capacity!");
            }
        }

        int filled = capacity - capacityleft;
        System.out.println(filled);


    }
}
