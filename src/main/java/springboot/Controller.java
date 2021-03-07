package springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/library")
@CacheConfig()
public class Controller {

    @Autowired
    Repositorio repository;


    @GetMapping("/getBooks")
    public Book[] getBooks() {
        return repository.getBooks();
    }

    @PostMapping("/postBooks")
    public Book postBook(@RequestBody Book book) throws InterruptedException {
        System.out.println("Hola");
        Thread.sleep(10000);
        System.out.println("Adios");
        return repository.postBooks(book);
    }




}
