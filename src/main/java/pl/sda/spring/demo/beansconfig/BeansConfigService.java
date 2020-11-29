package pl.sda.spring.demo.beansconfig;

public class BeansConfigService {

    private final CarsClient carsClient;

    public BeansConfigService(CarsClient carsClient) {
        this.carsClient = carsClient;
    }

    public String collect() {
        String car = carsClient.getCar();
        return "beans config!!! " + car;
    }
}
