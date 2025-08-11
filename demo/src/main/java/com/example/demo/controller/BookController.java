package com.example.demo.controller;

import com.example.demo.model.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.*;

@RestController
@RequestMapping("/books")
public class BookController {
    private List<Book> books = new ArrayList<>();

    //CREATE (POST)
    @PostMapping("/input")
    public Book addBook(@RequestBody Book book){
        books.add(book);
        return book;
    }

    //Read all (GET)
    @GetMapping
    public List<Book> getAllBooks(){
        return books;
    }

    //Update (PUT)
    @PutMapping("/{id}")
    public String updateBook(@PathVariable Long id, @RequestBody Book updatedBook){
        for (Book book : books){
            if (book.getId().equals(id)){
                book.setId(updatedBook.getId());
                book.setTitle(updatedBook.getTitle());
                book.setAuthor(updatedBook.getAuthor());
                book.setSerialno(updatedBook.getSerialno());
                book.setPages(updatedBook.getPages());
                return "Books updated " + book;
            }
        }
        return null;
    }

    //Delete (DELETE)
    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable Long id){
        books.removeIf(book -> book.getId().equals(id));
        return "Deleted book with id " + id;
    }

}
