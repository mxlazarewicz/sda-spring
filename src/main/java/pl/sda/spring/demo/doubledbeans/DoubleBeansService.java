package pl.sda.spring.demo.doubledbeans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class DoubleBeansService {

    private final ExchangeRateProvider exchangeRateProvider;

    public DoubleBeansService(@Qualifier("NBPExchangeRateClient") ExchangeRateProvider exchangeRateProvider) {
        this.exchangeRateProvider = exchangeRateProvider;
    }

    public double getRate(String symbol){
        return exchangeRateProvider.provide(symbol);
    }
}
