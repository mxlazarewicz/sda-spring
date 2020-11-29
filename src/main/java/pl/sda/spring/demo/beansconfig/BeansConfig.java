package pl.sda.spring.demo.beansconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    @Bean
    public BeansConfigService beansConfigService(CarsClient carsClient){
        return new BeansConfigService(carsClient);
    }

    @Bean
    public CarsClient carsClient(){
        return new CarsClient();
    }
}
