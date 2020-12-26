package com.hanna.books.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hanna.books.models.Book;
import com.hanna.books.repositories.BookRepository;


@RestController
public class BookController {

    @Autowired
    private final BookRepository repository;

    BookController(BookRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/book")
    public List<Book> allBooks() {
        System.out.println("Books retrieved");
        return repository.findAll();
    }
    @GetMapping("/book/{theme}")
    public List<Book> getBooksByTheme(@PathVariable String theme){
        return repository.findBooksByTheme(theme);
    }
    
    @PostMapping("/book/post")
    public int saveBook(@RequestBody Book book) {
        repository.save(book);
        System.out.println("Book saved");
        return book.getBookId();
    }

    @PutMapping("/book/put/{id}")
    public void updateBook(@RequestBody Book book, @PathVariable(value = "id") Integer id) {
        Book updateTarget = repository.getOne(id);
        updateTarget.setIsbn(book.getIsbn());
        updateTarget.setTitle(book.getTitle());
        updateTarget.setAuthor(book.getAuthor());
        updateTarget.setTheme(book.getTheme());
        updateTarget.setPublishedAt(book.getPublishedAt());
        repository.save(updateTarget);
        System.out.println("Book updated");
    }

    @DeleteMapping("/book/delete/{id}")
    public void deleteBook(@PathVariable(value = "id") Integer id) {
        repository.deleteById(id);
        System.out.println("Book deleted");
    }
}
