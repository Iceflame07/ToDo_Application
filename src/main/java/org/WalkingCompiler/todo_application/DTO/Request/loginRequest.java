package org.WalkingCompiler.todo_application.DTO.Request;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter @Setter
@Data
public class loginRequest {

    @Id
    private String username;
    private String password;
}
