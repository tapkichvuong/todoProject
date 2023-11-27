package com.codepresso.todo.controller;

import java.util.List;

import com.codepresso.todo.service.TodoService;
import com.codepresso.todo.vo.ResultDto;
import com.codepresso.todo.vo.Todo;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/todo")
public class TodoController {

    //Hãy viết code Dependency injection để ứng dụng TodoService
    public TodoService todoService;
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }
    //todo Kiểm tra API document rồi sử dụng phương thức GET để hoàn thành /todo REST API

    //todo Hãy sử dụng TodoService
    @RequestMapping(method = RequestMethod.GET)
    public List<Todo> getTodoList(){
        return todoService.getTodoList();
    }

    //todo Kiểm tra API document rồi sử dụng phương thức POST để hoàn thành /todo REST API

    //todo Hãy sử dụng TodoService
    @RequestMapping(method = RequestMethod.POST)

    public ResultDto addTodo(@RequestBody Todo todo) {
        todoService.addTodo(todo);
        //todo Đừng thay đổi return code
        return new ResultDto(200, "Success");
    }

    //todo Kiểm tra API document rồi sử dụng phương thức DELETE để hoàn thành /todo REST API

    //todo Hãy sử dụng TodoService
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")

    public ResultDto deleteTodo(@PathVariable("id") Integer id) {
        todoService.deleteTodo(id);
        //todo Đừng thay đổi return code
        return new ResultDto(200, "Success");
    }

}
