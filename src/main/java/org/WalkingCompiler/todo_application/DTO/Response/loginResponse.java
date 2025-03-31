package org.WalkingCompiler.todo_application.DTO.Response;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.WalkingCompiler.todo_application.DTO.Request.loginRequest;

@Getter @Setter
@Data
public class loginResponse extends loginRequest {

    private String userName;
    private String token;
}
