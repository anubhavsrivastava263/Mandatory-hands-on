import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exercise3 {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}
