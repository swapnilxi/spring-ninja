package com.swapnilxi.springbootmockito.Service;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.swapnilxi.springbootmockito.TodoServiceStub;
import com.swapnilxi.springbootmockito.service.TodoBusinessImpl;
import com.swapnilxi.springbootmockito.service.TodoService;

public class TodoServiceStubTest {
    @Test
	public void usingAStub() {
		TodoService todoService = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
		List<String> todos = todoBusinessImpl
				.retrieveTodosRelatedToSpring("Ranga");
		assertEquals(2, todos.size());
		assertEquals(2, todos.size());
	}
    
}
