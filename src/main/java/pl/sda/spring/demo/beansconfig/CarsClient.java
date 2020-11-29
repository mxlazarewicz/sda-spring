package pl.sda.spring.demo.beansconfig;

import org.springframework.web.client.RestTemplate;

public class CarsClient {

    private final RestTemplate restTemplate;

    public CarsClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getCar() {
        return "some car";
    }
}
