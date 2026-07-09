import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

class Country {

    private String code;
    private String name;

    public Country(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}

@RestController
public class Exercise4 {

    @GetMapping("/country")
    public Country getCountry() {

        return new Country("IN", "India");
    }
}
