package org.WalkingCompiler.todo_application.Entity;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "toDos")
@Data
public class ToDoEntity {

    @Id
    private int id;
    private String userId;
    private String title;
    private String description;
    private boolean completed;
}