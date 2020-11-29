package pl.sda.spring.demo.ex5;

public class NotManagedBySpring {
    private final String value;

    public NotManagedBySpring(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
