package pl.sda.spring.demo.ex4;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.spring.demo.util.Animal;

@RestController
public class Task04Controller {

    private final AnimalService animalService;

    public Task04Controller(AnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping("/task04")
    public ResponseEntity<Animal> getAnimal(){
        return ResponseEntity
                .ok(animalService.getAnimal());
    }
}
