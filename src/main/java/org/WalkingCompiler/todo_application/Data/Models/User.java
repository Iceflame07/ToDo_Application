package org.WalkingCompiler.todo_application.Data.Models;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter @Setter @NoArgsConstructor
@Data
public class User {

    @Id
    private int id;
    private String username;
    private String password;

}
