import jakarta.persistence.EntityManager;
import org.hibernate.Session;

public class Exercise6 {

    public void examples(EntityManager entityManager,
                         Session session,
                         CountryRepository repository,
                         Country country) {

        // JPA
        entityManager.persist(country);

        // Hibernate
        session.save(country);

        // Spring Data JPA
        repository.save(country);
    }
}
