package pl.sda.spring.demo.doubledbeans;

import org.springframework.stereotype.Component;

@Component
public class DbExchangeRateProvider implements ExchangeRateProvider {
    @Override
    public double provide(String symbol) {
        return 4.11;
    }
}
