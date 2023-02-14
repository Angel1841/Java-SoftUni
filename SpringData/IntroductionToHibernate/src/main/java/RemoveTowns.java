import entities.Address;
import entities.Town;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;
import java.util.Scanner;

public class RemoveTowns {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("soft_uni");
        EntityManager entityManager = emf.createEntityManager();

        String town = scanner.nextLine();

        List<Address> addresses = entityManager
                .createQuery("SELECT a FROM Address a WHERE a.town.name = :town", Address.class)
                .setParameter("town", town)
                .getResultList();

        int toDeleteAddresses = addresses.size();

        if(toDeleteAddresses == 0){
            System.out.println("No such town");
            entityManager.close();
            return;
        }

        entityManager.getTransaction().begin();

        addresses.forEach(ad -> {
            ad.getEmployees().forEach(e -> e.setAddress(null));
            entityManager.remove(ad);
        });

        Town townFromDB = entityManager
                .createQuery("SELECT t FROM Town t WHERE t.name = :town", Town.class)
                .setParameter("town", town)
                .getSingleResult();

        entityManager.remove(townFromDB);

        String address;

        if(toDeleteAddresses == 1) {
            address = "address";
        } else {
            address = "addresses";
        }

        System.out.printf("%d %s in %s deleted", toDeleteAddresses, address, town);

        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
