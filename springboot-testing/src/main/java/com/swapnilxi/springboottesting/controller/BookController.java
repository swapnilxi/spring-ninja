package com.swapnilxi.springboottesting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;

import com.swapnilxi.springboottesting.Book;
import com.swapnilxi.springboottesting.repository.BookRepository;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping(value="/book")
public class BookController {
    @Autowired 
    BookRepository bookRepository;
    
    @RequestMapping(value="/addbook", method=RequestMethod.POST)
    public Book createBookRecord(@RequestBody @Validated Book bookrecord) {
        return bookRepository.save(bookrecord);
    }
    

    
    
}
