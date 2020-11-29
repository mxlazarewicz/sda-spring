package pl.sda.spring.demo.ex5;

import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Task05Controller {

    private final ApplicationContext context;
    private final NotManagedBySpring notManagedBySpring;

    public Task05Controller(ApplicationContext context, NotManagedBySpring notManagedBySpring) {
        this.context = context;
        this.notManagedBySpring = notManagedBySpring;
    }

    @GetMapping("task05")
    public String task05(){
        NotManagedBySpring notManagedBySpring = context.getBean(NotManagedBySpring.class);
        return notManagedBySpring.toString();
    }
}
