package org.WalkingCompiler.todo_application.Controller;
import org.WalkingCompiler.todo_application.Services.ToDoService;
import org.apache.catalina.connector.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/ToDo")
public class ToDoController {

    @Autowired
    ToDoService toDoService;

    @GetMapping("/SignUp")
    public String SignUp(@RequestBody Request toDoRequest) {
        return toDoService.SignUp("SignUp");
    }

}
