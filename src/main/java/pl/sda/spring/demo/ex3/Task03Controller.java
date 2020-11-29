package pl.sda.spring.demo.ex3;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.spring.demo.util.Animal;

@RestController
public class Task03Controller {

    @PostMapping("/task03")
    @ResponseStatus(HttpStatus.CREATED)
    public void task03(@RequestBody Animal animal){
        System.out.println(animal);
    }
}
