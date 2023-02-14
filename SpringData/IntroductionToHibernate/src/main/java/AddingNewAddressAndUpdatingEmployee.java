import entities.Address;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;

public class AddingNewAddressAndUpdatingEmployee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lastName = scanner.nextLine();

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("soft_uni");
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();

        String newAddress = "Vitoshka 15";
        Address address = new Address();

        address.setText(newAddress);
        entityManager.persist(address);

        entityManager.createQuery("UPDATE Employee e" +
                        " SET e.address = :address " +
                        " WHERE e.lastName = :last_name")
                .setParameter("address", address)
                .setParameter("last_name", lastName)
                        .executeUpdate();

        entityManager.getTransaction().commit();
        entityManager.close();

    }
}
