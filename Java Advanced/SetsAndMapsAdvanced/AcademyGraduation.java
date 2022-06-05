import java.text.DecimalFormat;
import java.util.*;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, double[]> students = new TreeMap<>();

        for (int i = 0; i < n; i++) {

            String name = scanner.nextLine();

            double[] grades = Arrays.stream(scanner.nextLine().split( " "))
                    .mapToDouble(Double::parseDouble)
                    .toArray();

            students.put(name, grades);
        }

        String pattern = "#.###############################";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);

        for (Map.Entry<String, double[]> entry : students.entrySet()) {

            double average = 0;

            for (double num: entry.getValue()) {
                average += num;
            }

            average /= entry.getValue().length;

            System.out.printf("%s is graduated with %s%n",entry.getKey(), decimalFormat.format(average));
        }


    }
}
