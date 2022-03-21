import java.util.Scanner;

public class VolumePyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double dul = 0;
        double V = 0;
        double sh = 0;

        System.out.print("Length: ");
        dul = Double.parseDouble(scanner.nextLine());
        System.out.print("Width: ");
        sh = Double.parseDouble(scanner.nextLine());
        System.out.print("Height: ");
        V = Double.parseDouble(scanner.nextLine());


                double vol = (dul * sh * V)/3;
        System.out.printf("Pyramid Volume: %.2f",vol);
    }
}
