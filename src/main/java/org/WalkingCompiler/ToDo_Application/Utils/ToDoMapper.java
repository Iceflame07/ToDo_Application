package org.WalkingCompiler.ToDo_Application.Utils;
import org.WalkingCompiler.ToDo_Application.DTO.Request.LoginRequest;
import org.WalkingCompiler.ToDo_Application.DTO.Request.SignUpRequest;
import org.WalkingCompiler.ToDo_Application.Data.Models.ToDo;

import java.util.Optional;

public class ToDoMapper {

    public static LoginRequest mapToLoginRequest(ToDo toDo){
        return new LoginRequest(
                "",
                ""
        );
    }

    public static SignUpRequest mapToSignUpRequest(Optional<ToDo> toDo){
        return new SignUpRequest(
                "",
                ""
        );
    }

    public static ToDo mapToToDo(String toDo){
        return new ToDo(
                "",
                "",
                "",
                true,
                ""
        );
    }
}