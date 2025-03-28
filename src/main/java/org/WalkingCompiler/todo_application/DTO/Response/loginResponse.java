package org.WalkingCompiler.todo_application.DTO.Response;
import lombok.Getter;
import lombok.Setter;
import org.WalkingCompiler.todo_application.DTO.Request.loginRequest;

@Getter @Setter
public class loginResponse extends loginRequest {

    private String userName;
    private String message = "welcome";
}
