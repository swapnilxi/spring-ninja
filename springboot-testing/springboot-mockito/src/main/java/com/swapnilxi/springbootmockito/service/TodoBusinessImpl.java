package com.swapnilxi.springbootmockito.service;

import java.util.ArrayList;
import java.util.List;

//todoBusinessimpl- SUT
//todoservice- dependency
public class TodoBusinessImpl {
   private TodoService todoService;

	public TodoBusinessImpl(TodoService todoService) {
		this.todoService = todoService;
	}

	public List<String> retrieveTodosRelatedToSpring(String user) {
		List<String> allTodos = todoService.retrieveTodos(user);
		List<String> filteredTodos = new ArrayList<String>();
		for (String todo : allTodos) {
			if (todo.contains("Spring")) {
				filteredTodos.add(todo);
			}
		}
		return filteredTodos;
	}
}
