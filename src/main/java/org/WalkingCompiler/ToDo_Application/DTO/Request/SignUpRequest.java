package org.WalkingCompiler.ToDo_Application.DTO.Request;
import lombok.*;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Data
public class SignUpRequest {

    private String username;
    private String password;
}