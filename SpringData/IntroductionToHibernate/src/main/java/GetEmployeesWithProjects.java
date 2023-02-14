import entities.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;

public class GetEmployeesWithProjects {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("soft_uni");
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();

        int givenEmployeeId = Integer.parseInt(scanner.nextLine());

        Employee employee = entityManager.find(Employee.class ,givenEmployeeId);

        System.out.println(employee);

        entityManager.getTransaction().commit();
        entityManager.close();

    }
}
