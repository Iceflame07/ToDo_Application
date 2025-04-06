package org.WalkingCompiler.ToDo_Application.Services;
import org.WalkingCompiler.ToDo_Application.DTO.Request.LoginRequest;
import org.WalkingCompiler.ToDo_Application.DTO.Request.SignUpRequest;
import org.WalkingCompiler.ToDo_Application.Data.Models.ToDo;
import org.WalkingCompiler.ToDo_Application.Data.Repository.ToDoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface ToDoService {

    LoginRequest createToDo(ToDo toDo);
    SignUpRequest getToDoById(String id);
    List<ToDo> findByUserId(String userId);
    LoginRequest updateToDo(ToDo toDo);
    ToDoRepository deleteToDo(String id);
}