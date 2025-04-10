package org.WalkingCompiler.ToDo_Application.Services;
import org.WalkingCompiler.ToDo_Application.Data.Models.ToDo;
import org.WalkingCompiler.ToDo_Application.Data.Repository.ToDoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface ToDoService {

    ToDoRepository createToDo(ToDo toDo);
    ToDoRepository getToDoById(String id);
    List<ToDo> findByUserId(String userId);
    ToDoRepository updateToDo(ToDo toDo);
    void deleteToDo(String id);
}