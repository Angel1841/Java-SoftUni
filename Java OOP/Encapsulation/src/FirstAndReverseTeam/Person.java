package FirstAndReverseTeam;

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
        if(firstName.length() >= 3){
            this.firstName = firstName;
        } else {
            throw new IllegalArgumentException("First name cannot be less than 3 symbols");
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName.length() >= 3){
            this.lastName = lastName;
        } else {
            throw new IllegalArgumentException("Last name cannot be less than 3 symbols");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0){
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age cannot be zero or negative integer");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary >= 460){
            this.salary = salary;
        } else {
            throw new IllegalArgumentException("Salary cannot be less than 460 leva");
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %.1f leva", firstName, lastName, salary);
    }

    public void increaseSalary(double bonus) {
        if(this.age > 30){
            salary += salary * bonus / 100;
        } else {
            salary += salary * bonus / 200;
        }
    }
}
