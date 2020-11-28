package pl.sda.spring.demo.ex2;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Task02Controller {

    @GetMapping(value = "/task02", produces = MediaType.APPLICATION_JSON_VALUE)
    public Animal task02(){
        return new Animal("lion", 12);
    }

    @GetMapping(value = "/task02.1", produces = MediaType.APPLICATION_XML_VALUE)
    public Animal task021(){
        return new Animal("monkey", 1);
    }

    @GetMapping(value = "/task02.3")
    public Animal task023(){
        return new Animal("monkey", 5);
    }
}
