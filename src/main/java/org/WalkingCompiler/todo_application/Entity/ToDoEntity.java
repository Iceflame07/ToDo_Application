package org.WalkingCompiler.todo_application.Entity;
import lombok.*;
import org.springframework.data.annotation.Id;
import java.time.Instant;

@Data
@NoArgsConstructor
@Getter
@Setter
public class ToDoEntity {

    @Id
    private String title;
    private String description;
    private boolean isComplete;
    private Instant createdAt;
    private Instant completedAt;
    private Instant updatedAt;
    private String delete;


    public ToDoEntity(String title, String description, boolean isComplete, Instant createdAt, Instant completedAt, Instant updatedAt,  String delete) {
        this.title = title;
        this.description = description;
        this.isComplete = true;
        this.createdAt = createdAt;
        this.completedAt = completedAt;
        this.updatedAt = updatedAt;
        this.delete = delete;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", isComplete=" + isComplete +
                ", createdAt=" + createdAt +
                ", completedAt=" + completedAt +
                ", updatedAt=" + updatedAt +
                ", delete='" + delete + '\'' +
                '}';
    }
}