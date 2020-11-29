package pl.sda.spring.demo.ex5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Task05Config {

    @Bean
    public NotManagedBySpring notManagedBySpring(){
        return new NotManagedBySpring("some value");
    }
}
