package com.hirun.service;

import com.hirun.model.Todo;
import com.hirun.repository.TodoRepository;

import java.util.List;

public class TodoServiceImpl implements TodoService{


    private TodoRepository todoRepository;
    @Override
    public List<Todo> getAllTodos() {
        return List.of();
    }

    @Override
    public Todo createTodo(Todo todo) {
        return null;
    }

    @Override
    public void deleteTodo(long id) {

    }
}
