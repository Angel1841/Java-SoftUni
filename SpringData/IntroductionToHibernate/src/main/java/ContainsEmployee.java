import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;

public class ContainsEmployee {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("soft_uni");
        EntityManager entityManager = emf.createEntityManager();

        entityManager.getTransaction().begin();

        String[] searchedEmployees = console.nextLine().split("\\s+");

        String firstName = searchedEmployees[0];
        String lastName = searchedEmployees[1];

        Long record = entityManager.
                createQuery("SELECT count(e) FROM Employee e WHERE e.firstName = :first_name AND e.lastName = :last_name", Long.class).
                setParameter("first_name", firstName).
                setParameter("last_name", lastName).
                getSingleResult();

        if(record == 0){
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }

        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
