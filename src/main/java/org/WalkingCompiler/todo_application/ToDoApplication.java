package org.WalkingCompiler.todo_application;
import org.WalkingCompiler.todo_application.Controller.ToDoController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ToDoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ToDoApplication.class, args);
        SpringApplication.run(ToDoController.class, args);
 }
}