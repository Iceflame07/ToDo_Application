package org.WalkingCompiler.todo_application.DTO.Request;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.WalkingCompiler.todo_application.Entity.UserEntity;
import org.springframework.data.annotation.Id;

@Getter @Setter
@Data
public class SignUpRequest extends UserEntity {

    @Id
    private String UserName;
    private String Password;
}
