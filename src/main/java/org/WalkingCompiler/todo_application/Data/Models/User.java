package org.WalkingCompiler.todo_application.Data.Models;
import lombok.*;
import org.springframework.data.annotation.Id;

@Data @Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class User {

    @Id
    private int id;
    private String userName;
    private String password;
}
