package org.WalkingCompiler.ToDo_Application.DTO.Request;
import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LoginRequest {


    private String username;
    private String password;

}