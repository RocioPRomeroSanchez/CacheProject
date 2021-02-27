package springboot;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Book {

       String id;
       String title;
       String subtitle;
       String author;
       String published;
       String publisher;
       String pages;
       String description;


}
