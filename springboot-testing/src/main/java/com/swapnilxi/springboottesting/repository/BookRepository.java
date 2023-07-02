package com.swapnilxi.springboottesting.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.swapnilxi.springboottesting.Book;



public interface BookRepository extends JpaRepository<Book, Long> {
    
}
