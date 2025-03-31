package org.WalkingCompiler.todo_application.DTO.Response;
import lombok.Data;
import org.WalkingCompiler.todo_application.Data.Models.User;

@Data
public class SignUpResponse {

    private User user;
}