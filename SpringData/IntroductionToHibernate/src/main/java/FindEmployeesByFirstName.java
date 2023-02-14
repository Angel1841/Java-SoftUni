import entities.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;

public class FindEmployeesByFirstName {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("soft_uni");
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();

        entityManager
                .createQuery("SELECT e FROM Employee e WHERE e.firstName LIKE :firstName", Employee.class)
                .setParameter("firstName", firstName + "%")
                .getResultList()
                .forEach(employee -> System.out.printf("%s %s - %s - ($%.2f)",
                        employee.getFirstName(),
                        employee.getLastName(),
                        employee.getJobTitle(),
                        employee.getSalary()));

        entityManager.close();
    }
}
