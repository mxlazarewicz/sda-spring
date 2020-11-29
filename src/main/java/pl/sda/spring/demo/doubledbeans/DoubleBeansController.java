package pl.sda.spring.demo.doubledbeans;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoubleBeansController {

    private final DoubleBeansService doubleBeansService;

    public DoubleBeansController(DoubleBeansService doubleBeansService) {
        this.doubleBeansService = doubleBeansService;
    }

    @GetMapping("/rates")
    public double getRates(@RequestParam(defaultValue = "PL") String symbol){
        return doubleBeansService.getRate(symbol);
    }
}
