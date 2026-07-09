import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

@Entity
class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String code;
    private String name;

    public Country() {}

    public Country(String code, String name) {
        this.code = code;
        this.name = name;
    }
}

interface CountryRepository extends JpaRepository<Country, Integer> {
}

public class Exercise5 {

    @Autowired
    CountryRepository repository;

    public void saveCountry() {

        repository.save(new Country("IN", "India"));

        repository.findAll().forEach(System.out::println);
    }
}
