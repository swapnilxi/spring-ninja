package com.swapnilxi.springbootmockito.service;

import java.util.List;
//create to do service stub
//test todoImpl using todoserviceStub
public interface TodoService {
    public List<String> retrieveTodos(String user);
    
}
