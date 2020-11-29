package pl.sda.spring.demo.beans;

import org.springframework.stereotype.Component;

@Component
public class AlbumsClient {
    public String getAlbum() {
        return "some album";
    }
}
