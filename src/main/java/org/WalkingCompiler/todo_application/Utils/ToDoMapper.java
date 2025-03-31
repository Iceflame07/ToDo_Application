package org.WalkingCompiler.todo_application.Utils;
import org.WalkingCompiler.todo_application.DTO.Request.ToDoRequest;
import org.WalkingCompiler.todo_application.Data.Models.ToDo;
import org.WalkingCompiler.todo_application.Entity.ToDoEntity;
import org.springframework.stereotype.Component;

@Component
public class ToDoMapper {

    public static ToDo entityToToDo(ToDoEntity entity){
        ToDo toDo = new ToDo();
        toDo.setId(entity.getId());
        toDo.setUserId(entity.getUserId());
        toDo.setTitle(entity.getTitle());
        toDo.setDescription(entity.getDescription());
        toDo.setCompleted(entity.isCompleted());
        return toDo;
    }

    public static ToDoEntity requestToEntity(ToDoRequest request, String userId) {
        ToDoEntity entity = new ToDoEntity();
        entity.setUserId(userId);
        entity.setTitle(request.getTitle());
        entity.setDescription(request.getDescription());
        entity.setCompleted(false);
        return entity;
    }

}