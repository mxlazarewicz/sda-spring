package pl.sda.spring.demo.ex4;

import org.springframework.stereotype.Service;
import pl.sda.spring.demo.util.Animal;

@Service
public class AnimalService {

    public Animal getAnimal(){
        return new Animal("Cat", 13);
    }
}
