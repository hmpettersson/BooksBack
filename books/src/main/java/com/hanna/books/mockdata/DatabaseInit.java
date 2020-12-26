package com.hanna.books.mockdata;

import java.util.Arrays;
import java.util.List;

import com.hanna.books.models.Book;
import com.hanna.books.repositories.BookRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class DatabaseInit implements CommandLineRunner {

    @Autowired private BookRepository bookRepository;

    public DatabaseInit(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        generateBooks();
    }

    public void generateBooks() {
    	Book one = new Book("111111", "New Cowboy Poetry", "Cannon", "fiction");
    	Book two = new Book("222222", "Death's daughter", "Benson", "fiction");
    	Book three = new Book("333333", "Death's son", "Benson", "fiction");
    	Book four = new Book("444444", "Everything that remains", "Fields Millburn, Nicodemus", "biography");
    	Book five = new Book("5555555", "Lord of the Rings", "Tolkien", "fiction");
    	Book six = new Book("666666", "Wild", "Strayed", "biography");
    	Book seven = new Book("7777777", "Death on the Nile", "Christie", "crime");
    	Book eight = new Book("8888888", "Deaths of Jocasta", "Amber Redman", "crime");
    	Book nine = new Book("9999999", "Plant food", "Roll", "biography");
    	Book ten = new Book("10101010", "Nigella's kitchen", "Lawson", "biography");

        List<Book> books = Arrays.asList(one, two, three, four, five, six, seven, eight, nine, ten);

        if(bookRepository.count() == 0)
            bookRepository.saveAll(books);
    }
}
