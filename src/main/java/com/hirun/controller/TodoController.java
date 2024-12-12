package com.hirun.controller;


import com.hirun.model.ApiResponse;
import com.hirun.model.Todo;
import com.hirun.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
    private TodoService todoService;


    @GetMapping("/api/todos")
    public List<Todo>getAllTodos(){
        return todoService.getAllTodos();
    }

    @PostMapping("/api/todos")
    public Todo createTodo(@RequestBody Todo todo){
        return todoService.createTodo(todo);
    }

    @DeleteMapping("/api/todos/{id}")
    public Todo deleteTodo(@PathVariable long id) throws Exception {
         todoService.deleteTodo(id);
        ApiResponse res= new ApiResponse();
        res.setMessage("todo deleted successfully");
        res.setStatus(true);
         return null;
    }
}
