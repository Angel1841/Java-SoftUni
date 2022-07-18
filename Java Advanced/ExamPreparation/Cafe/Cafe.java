package cafe;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Cafe {
    private List<Employee> employees;
    private int capacity;
    private String name;

    public Cafe( String name, int capacity) {
        this.capacity = capacity;
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        if(employees.size() < capacity){
            employees.add(employee);
        }
    }

    public boolean removeEmployee(String name){
        return this.employees.removeIf(p -> p.getName().equals(name));
    }

    public Employee getOldestEmployee(){
        return this.employees.stream().max(Comparator.comparing(Employee::getAge)).orElse(null);
    }

    public Employee getEmployee(String name){

        for (Employee e: employees) {
            if(e.getName().equals(name)){
                return e;
            }
        }
        return null;
    }

    public int getCount(){
        return this.employees.size();
    }

    public String report(){
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("Employees working at Cafe %s:%n", this.name));

        for (Employee ep: employees) {
            sb.append(ep.toString());
            sb.append(System.lineSeparator());
        }

        return sb.toString();
    }
}
