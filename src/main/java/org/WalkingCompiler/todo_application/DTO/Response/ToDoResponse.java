package org.WalkingCompiler.todo_application.DTO.Response;
import lombok.Data;
import org.WalkingCompiler.todo_application.Data.Models.ToDo;

@Data
public class ToDoResponse {

    private ToDo toDo;
    private String message;

}
