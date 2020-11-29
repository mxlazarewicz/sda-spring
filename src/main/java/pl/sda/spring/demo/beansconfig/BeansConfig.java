package pl.sda.spring.demo.beansconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class BeansConfig {

    @Bean
    public BeansConfigService beansConfigService(CarsClient carsClient){
        return new BeansConfigService(carsClient);
    }

    @Bean
    public CarsClient carsClient(RestTemplate restTemplate){
        return new CarsClient(restTemplate);
    }

    @Bean
    public RestTemplate carsRestTemplate(){
        return new RestTemplate();
    }
}
