package spring.boot.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/")
    public String greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return "Hello " + name + ", You are looking so good today!";
    }
}
