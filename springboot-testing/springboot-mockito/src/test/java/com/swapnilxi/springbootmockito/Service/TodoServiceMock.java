package com.swapnilxi.springbootmockito.Service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import com.swapnilxi.springbootmockito.service.TodoBusinessImpl;
import com.swapnilxi.springbootmockito.service.TodoService;

public class TodoServiceMock {

    @Test 
    public void testRetrieveTodosrealatedtoSpringMock(){
        TodoService todoServiceMock = mock(TodoService.class);
        List<String> todos = Arrays.asList("Learn Spring MVC", "Learn Spring" ,
        "Learn to Dance");
        when(todoServiceMock. retrieveTodos( "Dummy" )). thenReturn(todos) ;

		assertEquals(2, todos.size());

    }
}
