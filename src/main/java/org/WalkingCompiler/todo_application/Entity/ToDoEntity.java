package org.WalkingCompiler.todo_application.Entity;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document(collection = "toDo")
public class ToDoEntity {

    @Id
    private String id;
    private String title;
    private String description;
    private String userId;

    @Generated
    private boolean completed;
    private boolean update;

    public ToDoEntity(String title, String description, boolean completed, boolean update,  String userId) {
        this.title = title;
        this.description = description;
        this.userId = userId;
        this.completed = true;
        this.update = true;
    }
}