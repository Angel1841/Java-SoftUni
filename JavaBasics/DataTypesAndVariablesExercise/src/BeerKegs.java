import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double vol = 0;

        double biggestVol = 0;
        String biggestKeg = "";

        for(int i = 0;i<n;i++)
        {
            String model = scanner.nextLine();
            float radius = Float.parseFloat(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            vol = Math.PI * radius * radius * height;

            if(vol > biggestVol){
                biggestVol = vol;
                biggestKeg = model;
            }
        }
        System.out.println(biggestKeg);




    }
}
