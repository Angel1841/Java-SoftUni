import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class Students {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String input = scanner.nextLine();

            String[] tokens = input.split(" ");

            String name = tokens[0];
            String lastName = tokens[1];
            double age = Double.parseDouble(tokens[2]);

            Student student = new Student(name, lastName, age);

            students.add(student);

        }

        students.sort(Comparator.comparing(Student::getAge, Comparator.reverseOrder()));

        for (Student student: students) {
            System.out.println(student.toString());
        }
    }


    static class Student{
        private String name;
        private String lastName;
        private double grade;

        @Override
        public String toString() {
            return String.format("%s %s: %.2f",this.name,this.lastName,this.grade);
        }

        public Student(String name, String lastName, double grade) {
            this.name = name;
            this.lastName = lastName;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public double getAge() {
            return grade;
        }

        public void setAge(double age) {
            this.grade = age;
        }
    }
}
