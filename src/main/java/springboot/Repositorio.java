package springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;

@Repository
public class Repositorio {
    @Value("${json-server.url}")
    String url;

    RestTemplate restTemplate=new RestTemplate();

    public String getUrl() {
        return url;
    }
    private HttpHeaders getHttpHeaders(){
        HttpHeaders headers= new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        return headers;
    }

    public Book[] getBooks() {
        Book[] bookList;
        bookList = restTemplate.getForObject(url,Book[].class);

        return bookList;
    }

    public Book postBooks(Book book) {
        HttpEntity<String> request = new HttpEntity(book,getHttpHeaders());
        Book response = restTemplate.postForObject(url,request,Book.class);
        return response;
    }
}
