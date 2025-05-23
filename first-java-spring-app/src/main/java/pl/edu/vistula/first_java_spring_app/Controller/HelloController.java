package pl.edu.vistula.first_java_spring_app.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value= "/")
    public String hello() {
        return "Hello World,It's my first Spring Controller";
    }
    
    @GetMapping("/greeting")
    public String greeting(@RequestParam(name= "name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name",name);
        return "greeting";
    }
}
