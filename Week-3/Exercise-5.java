import org.springframework.web.bind.annotation.*;

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
@RequestMapping("/countries")
public class Exercise5 {

    @GetMapping("/{code}")
    public Country getCountry(@PathVariable String code) {

        if (code.equalsIgnoreCase("IN"))
            return new Country("IN", "India");

        if (code.equalsIgnoreCase("US"))
            return new Country("US", "United States");

        return new Country("NA", "Not Found");
    }
}
