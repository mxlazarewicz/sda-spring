package pl.sda.spring.demo.doubledbeans;

public interface ExchangeRateProvider {
    double provide(String symbol);
}
