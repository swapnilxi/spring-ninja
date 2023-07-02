package com.swapnilxi.springbootmockito;

import java.util.Arrays;
import java.util.List;

import com.swapnilxi.springbootmockito.service.TodoService;

public class TodoServiceStub implements TodoService{

    @Override
    public List<String> retrieveTodos(String user) {
        return Arrays.asList("learn spring", "learrn java", "learn spring java");
    }
    
}
