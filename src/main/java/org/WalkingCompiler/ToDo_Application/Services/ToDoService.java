package org.WalkingCompiler.ToDo_Application.Services;
import org.WalkingCompiler.ToDo_Application.Data.Models.ToDo;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public interface ToDoService {

    ToDo createToDo(ToDo toDo);
    Optional<ToDo> getToDoById(String id);
    List<ToDo> findByUserId(String userId);
    ToDo updateToDo(ToDo toDo);
    void deleteToDo(String id);
}