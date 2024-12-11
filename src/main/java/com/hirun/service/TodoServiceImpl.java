package com.hirun.service;

import com.hirun.model.Todo;
import com.hirun.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService{

    @Autowired
    private TodoRepository todoRepository;
    @Override
    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    @Override
    public Todo createTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    @Override
    public void deleteTodo(long id) throws Exception {
        Todo todo=todoRepository.findById(id).orElseThrow(() -> new Exception("todo do not exist"));
        todoRepository.delete(todo);
    }
}
