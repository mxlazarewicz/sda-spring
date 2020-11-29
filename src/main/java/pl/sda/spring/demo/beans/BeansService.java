package pl.sda.spring.demo.beans;

import org.springframework.stereotype.Service;

@Service
public class BeansService {

    private final AlbumsClient albumsClient;
    private final BooksClient booksClient;

    public BeansService(AlbumsClient albumsClient, BooksClient booksClient) {
        this.albumsClient = albumsClient;
        this.booksClient = booksClient;
    }

    public String collect() {
        String album = albumsClient.getAlbum();
        String book = booksClient.getBook();
        return "beans!!! " + album + " " + book;
    }
}
