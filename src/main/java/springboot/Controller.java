package springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@CacheConfig()
public class Controller {

    @Autowired
    Repositorio repository;


    @RequestMapping("/getBooks")
    public Book[] getBooks() {
        return repository.getBooks();
    }

    @RequestMapping("/postBook")
    public Book postBook(@RequestBody Book book) {
        return repository.postBooks(book);
    }




}
