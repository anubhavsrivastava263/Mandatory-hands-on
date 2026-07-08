package com.library;
import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.BookService;
public class LibraryManagementApplication{
 public static void main(String[] args){
  ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
  BookService service=(BookService)context.getBean("bookService");
  service.addBook("Spring Framework");
 }
}