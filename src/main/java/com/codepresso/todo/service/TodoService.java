package com.codepresso.todo.service;

import java.util.Iterator;
import java.util.List;

import com.codepresso.todo.vo.Todo;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    private List<Todo> todoList;
    private Integer id;
    private String isCompleted;
    //todo Hoàn thành code để Dependency injection vào biến thành viên todoList

    public TodoService(List<Todo> todoList) {
        this.todoList = todoList;
        this.id = 0;
        this.isCompleted = "false";
    }

    public void addTodo(Todo todo) {
        //todo Thêm hạng mục mới vào todoList
        todo.setId(this.id);
        todo.setIsCompleted(this.isCompleted);
        id++;
        todoList.add(todo);
    }

    public List<Todo> getTodoList(){
        //todo Trả về thông tin todoList
        return todoList;
    }

    public void deleteTodo(int id) {
        //todo Xóa hạng mục tương ứng với index trong todoList
        todoList.removeIf(obj -> obj.getId() == id);
    }
}
