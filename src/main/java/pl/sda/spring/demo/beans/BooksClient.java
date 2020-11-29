package pl.sda.spring.demo.beans;

import org.springframework.stereotype.Component;

@Component
public class BooksClient {
    public String getBook() {
        return "some book";
    }
}
