import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class EmployeesWithSalaryOver5000 {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("soft_uni");
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();

        List<String> employeesFirstNames = entityManager.createQuery("SELECT e.firstName FROM Employee e WHERE e.salary > 50000", String.class).getResultList();

        System.out.println(String.join(" ", employeesFirstNames));

        entityManager.getTransaction().commit();
        entityManager.close();

    }
}
