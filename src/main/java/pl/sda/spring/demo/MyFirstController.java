package pl.sda.spring.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstController {

    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name", defaultValue = "World!") String name){
        return "Hello " + name;
    }
}
