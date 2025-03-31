package org.WalkingCompiler.todo_application.Data.Models;
import lombok.*;
import org.springframework.data.annotation.Id;

@Data
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class ToDo {

    @Id
    private int userId;
    private String title;
    private String description;
    private boolean completed;
}