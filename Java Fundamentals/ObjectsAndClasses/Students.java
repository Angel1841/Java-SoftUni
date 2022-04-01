import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {

    static class Student{

        private String name;
        private String lastName;
        private String age;
        private String city;

        public Student(String name, String lastName, String age, String city) {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
            this.city = city;
        }

        public String getLastName(){
            return this.lastName;
        }

        public String getCity(){
            return this.city;
        }

        public String getName(){
            return this.name;
        }

        public String getAge(){
            return this.age;
        }

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        List<Student> students = new ArrayList<>();

        while(!line.equals("end")){

            String[] tokens = line.split(" ");

            String name = tokens[0];
            String lastName = tokens[1];
            String age = tokens[2];
            String city = tokens[3];

            Student student = new Student(name,lastName,age,city);

            students.add(student);

            line = scanner.nextLine();
        }

        String searchedCity = scanner.nextLine();

        for (Student student:students) {
            if(student.getCity().equals(searchedCity)){
                System.out.printf("%s %s is %s years old\n",student.getName(),student.getLastName(),student.getAge());
            }
        }

    }
}
