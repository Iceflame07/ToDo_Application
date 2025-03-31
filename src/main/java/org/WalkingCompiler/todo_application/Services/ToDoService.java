package org.WalkingCompiler.todo_application.Services;
import org.WalkingCompiler.todo_application.DTO.Request.ToDoRequest;
import org.WalkingCompiler.todo_application.Data.Models.ToDo;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public interface ToDoService {

    ToDo createToDo(ToDoRequest request, String userId);
    List<ToDo> getAllToDos(String userId);
    Optional<ToDo> getToDoById(String id, String userId);
    ToDo updateToDo(String id, ToDoRequest request, String userId);
    void deleteToDo(String id, String userId);
}