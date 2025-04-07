package org.WalkingCompiler.ToDo_Application.Services;
import org.WalkingCompiler.ToDo_Application.Data.Models.ToDo;
import org.WalkingCompiler.ToDo_Application.Data.Repository.ToDoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface ToDoService {

    ToDo createToDo(ToDo toDo);
    ToDo getToDoById(String id);
    List<ToDo> findByUserId(String userId);
    ToDo updateToDo(ToDo toDo);
    ToDoRepository deleteToDo(String id);
}