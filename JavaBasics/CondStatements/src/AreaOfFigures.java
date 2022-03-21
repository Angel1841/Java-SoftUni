import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();
        if(figure.equals("square")){
            double squarePart = Double.parseDouble(scanner.nextLine());
            double area = squarePart * squarePart;
            System.out.printf("%.3f",area);
        }

        if(figure.equals("rectangle")){
            double rectanglePart = Double.parseDouble(scanner.nextLine());
            double rectanglePart2 = Double.parseDouble(scanner.nextLine());
            double area = rectanglePart * rectanglePart2 ;
            System.out.printf("%.3f",area);
        }

        if(figure.equals("circle")){
            double circlePart = Double.parseDouble(scanner.nextLine());
            double area = circlePart * circlePart * Math.PI;
            System.out.printf("%.3f",area);
        }

        if(figure.equals("triangle")){
            double trianglePart = Double.parseDouble(scanner.nextLine());
            double trianglePart2 = Double.parseDouble(scanner.nextLine());
            double area = trianglePart * trianglePart2 / 2;
            System.out.printf("%.3f",area);
        }
    }
}
