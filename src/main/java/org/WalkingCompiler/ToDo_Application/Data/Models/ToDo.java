package org.WalkingCompiler.ToDo_Application.Data.Models;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
public class ToDo {

    @Id
    private String id;
    private String title;
    private String description;
    private boolean completed;
    private String userId;
}