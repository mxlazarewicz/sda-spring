package pl.sda.spring.demo.beansconfig;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoBeansConfigController {

    private final BeansConfigService beansConfigService;

    public DemoBeansConfigController(BeansConfigService beansConfigService) {
        this.beansConfigService = beansConfigService;
    }

    @GetMapping("/beans-config")
    public String beans(){
        return beansConfigService.collect();
    }
}
