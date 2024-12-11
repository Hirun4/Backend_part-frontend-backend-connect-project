package com.hirun.controller;


import com.hirun.model.Todo;
import com.hirun.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
    private TodoService todoService;


    @GetMapping
    public List<Todo>getAllTodos(){
        return todoService.getAllTodos();
    }

    @GetMapping
    public Todo createTodo(@RequestBody Todo todo){
        return todoService.createTodo(todo);
    }
}
