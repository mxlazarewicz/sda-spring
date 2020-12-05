package pl.sda.spring.demo.props;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropsController {

    private final String myPropsValue;

    public PropsController(@Value("${demo.props.value}") String myPropsValue) {
        this.myPropsValue = myPropsValue;
    }

    @GetMapping("/props")
    public String getProps(){
        return myPropsValue;
    }
}
