package CompanyRoster;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Employee> employees = new ArrayList<>();

        List<Department> departmentList = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String[] tokens = scanner.nextLine().split(" ");

            String name = tokens[0];
            double salary = Double.parseDouble(tokens[1]);
            String position = tokens[2];
            String department = tokens[3];

            Employee employee = null;
            switch (tokens.length){
                case 4:
                     employee = new Employee(name, salary, position, department);
                    break;
                case 6:

                    String email = tokens[4];
                    int age = Integer.parseInt(tokens[5]);

                    employee = new Employee(name, salary, position, department, email, age);

                    break;
                case 5:
                    if(tokens[4].matches("\\d+")) {

                        int personAge = Integer.parseInt(tokens[4]);
                        employee = new Employee(name, salary, position, department, personAge);

                    } else{

                        String personEmail = tokens[4];
                        employee = new Employee(name, salary, position, department, personEmail);

                    }
                    break;

            }



            boolean departmentExists = departmentList.stream().filter(dep -> dep.getName().equals(department)).count() >= 1;

            if(!departmentExists){
                departmentList.add(new Department(department));
            }
            Department currentDepartment = departmentList.stream().filter(dep -> dep.getName().equals(department)).findFirst().get();
            currentDepartment.getEmployees().add(employee);


        }

        Department highestPaidDepartment = departmentList.stream().max(Comparator.comparingDouble(Department::averageSalary)).get();

        System.out.printf("Highest Average Salary: %s%n",highestPaidDepartment.getName());
        highestPaidDepartment.getEmployees()
                .stream()
                .sorted((a1, a2) -> Double.compare(a2.getSalary(),a1.getSalary())).forEach(System.out::println);
    }
}
