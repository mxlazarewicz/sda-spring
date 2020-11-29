package pl.sda.spring.demo.ex5;

import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Task05Controller {

    private final ApplicationContext context;

    public Task05Controller(ApplicationContext context) {
        this.context = context;
    }

    @GetMapping("task05")
    public String task05(){
        return "";
    }
}
