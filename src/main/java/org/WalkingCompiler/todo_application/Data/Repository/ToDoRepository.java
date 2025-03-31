package org.WalkingCompiler.todo_application.Data.Repository;
import org.WalkingCompiler.todo_application.DTO.Request.ToDoRequest;
import org.WalkingCompiler.todo_application.Data.Models.ToDo;
import org.WalkingCompiler.todo_application.Entity.ToDoEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ToDoRepository extends MongoRepository<ToDoEntity, String> {
    ToDo save(String ToDoRequest);
    List<ToDoEntity> findByUserId(String userId);
    ToDo updateToDo(String id, ToDoRequest request, int id1);
    void deleteToDo(String id, int id1);
}