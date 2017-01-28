package spring.boot.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class Index {

    @RequestMapping("/greeting")
    public ModelAndView greeting(@RequestParam(value="name", required=false, defaultValue="World") String name) {
        Map<String, String > params = new HashMap<>();
        params.put("name", name);
        return new ModelAndView("indexThymeleaf", params);
    }

}
