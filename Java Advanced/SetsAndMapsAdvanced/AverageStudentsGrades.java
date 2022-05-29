import java.util.*;

public class AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        TreeMap<String, List<Double>> students = new TreeMap<>();

        for (int i = 0; i < n; i++) {

            String[] input = scanner.nextLine().split(" ");
            String name = input[0];
            double grade = Double.parseDouble(input[1]);

            if(!students.containsKey(name)){
                students.put(name, new ArrayList<>());
            }
            students.get(name).add(grade);

        }

        for (Map.Entry<String, List<Double>> entry : students.entrySet()) {
            double sum = 0;
            System.out.print(entry.getKey() + " -> ");
            for (double grade: students.get(entry.getKey())) {
                System.out.printf("%.2f ", grade);
                sum += grade;
            }
            System.out.printf("(avg: %.2f)", sum / students.get(entry.getKey()).size());
            System.out.println();
        }

    }
}
