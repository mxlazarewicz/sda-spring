package pl.sda.spring.demo.ex3additional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.spring.demo.ex2.Animal;

import java.time.ZonedDateTime;

@RestController
public class Task03AdditionalController {

    @PostMapping("/task03.additional")
    public ResponseEntity<Animal> task04(@RequestBody Animal animal){
        return ResponseEntity
                .accepted()
                .lastModified(ZonedDateTime.now())
                .body(animal);
    }
}
