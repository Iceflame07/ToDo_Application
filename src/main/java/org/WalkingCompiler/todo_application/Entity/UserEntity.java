package org.WalkingCompiler.todo_application.Entity;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
@Data
public class UserEntity {

    @Id
    private int id;
    private String username;
    private String password;
}
