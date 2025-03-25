package org.WalkingCompiler.todo_application.DTO.Response;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class loginResponse {

    private String userName;
    private String password;
    private String message = "welcome";
}
