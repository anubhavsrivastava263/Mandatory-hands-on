package com.library;
import com.library.service.BookService;
import com.library.repository.BookRepository;

public class App {
    public static void main(String[] args){
        // Create instances without Spring (works with Java 21)
        BookRepository repository = new BookRepository();
        BookService service = new BookService();
        service.setBookRepository(repository);
        
        // Add and display books
        service.addBook("Spring Framework");
        service.addBook("Java 21 LTS");
        service.addBook("Maven Guide");
        
        System.out.println("Books added successfully!");
    }
}