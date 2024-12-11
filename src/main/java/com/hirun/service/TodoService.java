package com.hirun.service;

import com.hirun.model.Todo;

import java.util.List;

public interface TodoService {
List<Todo> getAllTodos();
Todo createTodo(Todo todo);

void deleteTodo(long id);
}
