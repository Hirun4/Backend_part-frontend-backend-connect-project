package com.hirun.repository;

import com.hirun.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;



public interface TodoRepository extends JpaRepository<Todo,Long> {
}
