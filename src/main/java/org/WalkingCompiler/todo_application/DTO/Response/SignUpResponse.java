package org.WalkingCompiler.todo_application.DTO.Response;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class SignUpResponse {

    private String userName;
    private String message = "Registration successful";
}