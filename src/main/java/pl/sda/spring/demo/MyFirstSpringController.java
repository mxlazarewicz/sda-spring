package pl.sda.spring.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstSprongController {
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World!")String name){
        return "Hello " + name;

    }

}
