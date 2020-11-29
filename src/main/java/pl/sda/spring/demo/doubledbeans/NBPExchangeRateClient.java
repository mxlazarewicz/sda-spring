package pl.sda.spring.demo.doubledbeans;

import org.springframework.stereotype.Component;

@Component
public class NBPExchangeRateClient implements ExchangeRateProvider {
    @Override
    public double provide(String symbol) {
        return 4.22;
    }
}
