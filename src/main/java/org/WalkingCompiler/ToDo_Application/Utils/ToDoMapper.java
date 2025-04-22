package org.WalkingCompiler.ToDo_Application.Utils;
import org.WalkingCompiler.ToDo_Application.Data.Models.ToDo;
import org.WalkingCompiler.ToDo_Application.Services.ToDoService;

public class ToDoMapper {

    public static ToDo mapToToDo(String toDoService){
        return new ToDo(
                "",
                "",
                true,
                ""
        );
    }

    public static ToDoService mapToToDo(ToDo toDo){
        return (ToDoService) new ToDo(
                "",
                "",
                true,
                ""
        );
    }
}