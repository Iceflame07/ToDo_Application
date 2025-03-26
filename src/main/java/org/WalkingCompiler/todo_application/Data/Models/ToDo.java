package org.WalkingCompiler.todo_application.Data.Models;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data @Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Document(collection = "ToDo_Application")
public class ToDo {

    @Id
    private String viewTask;
    private String addTask;
    private String editTask;
    private String updateTask;
    private String deleteTask;
}
