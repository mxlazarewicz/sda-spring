package pl.sda.spring.demo.beans;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoBeansController {

    private final BeansService beansService;

    public DemoBeansController(BeansService beansService) {
        this.beansService = beansService;
    }

    @GetMapping("/beans")
    public String beans(){
        return beansService.collect();
    }
}
