package com.hanna.books.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hanna.books.models.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{
	
	List<Book> findAllByBookId(int BookId);

    @Query(value="SELECT DISTINCT isbn FROM Book")
    List<Book> findAllByOrderByIsbnAsc();
    
    List<Book> findBooksByTheme(String theme);
}

