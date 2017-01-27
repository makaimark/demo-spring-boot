package spring.boot.example;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Index {

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
