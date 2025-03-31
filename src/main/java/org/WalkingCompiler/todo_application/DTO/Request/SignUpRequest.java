package org.WalkingCompiler.todo_application.DTO.Request;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter @Setter
@Data
public class SignUpRequest {

    @Id
    private String UserName;
    private String Password;
}
