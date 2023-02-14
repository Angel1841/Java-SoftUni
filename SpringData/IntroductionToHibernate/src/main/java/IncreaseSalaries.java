import entities.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class IncreaseSalaries {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("soft_uni");
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();


        List<String> departmentsList = Arrays.asList("Engineering", "Tool Design", "Marketing", "Information Services");

        entityManager.
                createQuery("SELECT e FROM Employee e " +
                        "WHERE e.department.name IN ( :departments ) ", Employee.class).
                setParameter("departments", departmentsList)
                .getResultList()
                .forEach(e -> {
                    e.setSalary(e.getSalary().multiply(BigDecimal.valueOf(1.12)));
                    entityManager.persist(e);
                });

        entityManager.
                createQuery("SELECT e FROM Employee e " +
                        "WHERE e.department.name IN ( :departments ) ", Employee.class).
                setParameter("departments", departmentsList).
                getResultList().
                forEach(e -> System.out.printf("%s %s ($%.2f)%n", e.getFirstName(), e.getLastName(), e.getSalary()));

        entityManager.getTransaction().commit();
        entityManager.close();

    }
}
