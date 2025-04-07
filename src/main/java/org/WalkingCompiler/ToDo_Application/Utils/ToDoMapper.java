package org.WalkingCompiler.ToDo_Application.Utils;
import org.WalkingCompiler.ToDo_Application.Data.Models.ToDo;

public class ToDoMapper {

    public static ToDo mapToToDo(String toDo){
        return new ToDo(
                "",
                "",
                true,
                ""
        );
    }
}