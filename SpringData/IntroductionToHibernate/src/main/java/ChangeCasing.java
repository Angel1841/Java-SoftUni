import entities.Town;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class ChangeCasing {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("soft_uni");
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();

        Query townQuery = entityManager.createQuery("FROM Town t", Town.class);

        List<Town> resultList = townQuery.getResultList();

        List<Town> filteredTowns = resultList.stream().
                filter(town -> town.getName().length() <= 5).toList();

        for (var t: filteredTowns) {
            t.setName(t.getName().toUpperCase());
            entityManager.persist(t);
        }

        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
