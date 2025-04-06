package org.WalkingCompiler.ToDo_Application.Data.Models;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {

    @Id
    private String id;
    private String username;
    private String password;
}