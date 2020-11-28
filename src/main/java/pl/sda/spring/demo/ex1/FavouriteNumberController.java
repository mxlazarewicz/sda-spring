package pl.sda.spring.demo.ex1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FavouriteNumberController {

    @GetMapping("/favourite/{number}")
    public String favouriteNumber(@PathVariable String number, @RequestParam(defaultValue = "") String name){
        int parsedNumber;

        try {
            parsedNumber = Integer.parseInt(number);
        } catch (NumberFormatException e){
            return "Hello, your favourite number is: NaN";
        }

        if (name.isEmpty()){
            return "Hello, your favourite number is: " + parsedNumber;
        } else {
            return "Hello " + name + ", your favourite number is: " + parsedNumber;
        }
    }
}
