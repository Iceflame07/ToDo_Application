package org.WalkingCompiler.todo_application.Data.Models;
import lombok.*;
import org.springframework.data.annotation.Id;

@Data @Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class ToDo {

    @Id
    private String viewTask;
    private String addTask;
    private String editTask;
    private String updateTask;
    private String deleteTask;
}
