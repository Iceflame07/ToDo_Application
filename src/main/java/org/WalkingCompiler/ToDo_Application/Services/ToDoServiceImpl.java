package org.WalkingCompiler.ToDo_Application.Services;
import org.WalkingCompiler.ToDo_Application.Data.Models.ToDo;
import org.WalkingCompiler.ToDo_Application.Data.Repository.ToDoRepository;
import org.WalkingCompiler.ToDo_Application.Utils.ToDoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;
import java.util.List;
import java.util.Optional;

@Service
public class ToDoServiceImpl implements ToDoService {

    @Autowired
    private ToDoRepository toDoRepository;

    @Override
    public ToDoRepository createToDo(ToDo toDo) {
        ToDo toDo1 = ToDoMapper.mapToToDo(((ToDoService) toDo).toString());
        ToDo savedToDo = toDoRepository.save(toDo1);
        return (ToDoRepository) ToDoMapper.mapToToDo(((ToDoService) savedToDo).toString());
    }

    @Override
    public ToDoRepository getToDoById(String id) {
        ToDo toDo = ToDoMapper.mapToToDo(id);
        Optional<ToDo> getId = toDoRepository.findById(String.valueOf(toDo));
        return (ToDoRepository) ToDoMapper.mapToToDo(String.valueOf(getId));
    }

    @Override
    public List<ToDo> findByUserId(String userId) {
        ToDo toDo = ToDoMapper.mapToToDo(userId);
        ToDo UserId = (ToDo) toDoRepository.findByUserId(String.valueOf(toDo));
        return (List<ToDo>) ToDoMapper.mapToToDo(String.valueOf(UserId));
    }

    @Override
    public ToDoRepository updateToDo(ToDo toDo) {
        ToDo toDo1 = ToDoMapper.mapToToDo("");
        ToDo updated = toDoRepository.save(toDo1);
        return (ToDoRepository) ToDoMapper.mapToToDo(String.valueOf(updated));
    }

    @Override
    public void deleteToDo(String id) {
        ToDo toDo = toDoRepository.findById(toString()).orElseThrow(
                () -> new ResourceAccessException("ToDo with given userId doesn't exist!")
        );
        toDoRepository.delete(toDo);
    }
}