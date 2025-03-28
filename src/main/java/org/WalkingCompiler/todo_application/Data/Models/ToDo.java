package org.WalkingCompiler.todo_application.Data.Models;
import lombok.*;
import org.springframework.data.annotation.Id;
import java.time.Instant;

@Data @Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class ToDo {

    @Id
    private String title;
    private String description;
    private boolean isComplete;
    private Instant createdAt;
    private Instant completedAt;
    private Instant updatedAt;
    private String delete;

    @Override
    public String toString() {
        return String.format("Todo{id=%d, title='%s', description='%s', isComplete='%s', createdAt='%s', updatedAt='%s', delete'%s'",
        title, description, isComplete, createdAt, updatedAt, delete);
    }
}