package SalaryIncrease;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    private double salary;


    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, double salary) {
        this(firstName, lastName, age);
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %.2f leva", this.firstName, this.lastName, this.salary);
    }


    public void increaseSalary(double bonus) {
        if(this.age > 30){
            salary += salary * bonus / 100;
        } else {
            salary += salary * bonus / 200;
        }
    }
}
