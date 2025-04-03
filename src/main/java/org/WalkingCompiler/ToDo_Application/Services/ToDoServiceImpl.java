package org.WalkingCompiler.ToDo_Application.Services;
import org.WalkingCompiler.ToDo_Application.Data.Models.ToDo;
import org.WalkingCompiler.ToDo_Application.Data.Repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ToDoServiceImpl implements ToDoService {

    @Autowired
    private ToDoRepository toDoRepository;

    public ToDoServiceImpl(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    @Override
    public ToDo createToDo(ToDo toDo) {
        ToDo toDo1 = new ToDo();
        toDo1.setId("1");
        toDo1.setDescription("write a front-end code in javascript");
        return toDoRepository.save(toDo);
    }

    @Override
    public Optional<ToDo> getToDoById(String id) {
        ToDo toDo = new ToDo();
        toDo.setTitle("ToDoList");
        return toDoRepository.findById("1");
    }

    @Override
    public List<ToDo> findByUserId(String userId) {
        ToDo toDo = new ToDo();
        toDo.setUserId(toDo.getUserId());
        return List.of(toDo);
    }

    @Override
    public ToDo updateToDo(ToDo toDo) {
        ToDo toDo1 = new ToDo();
        toDo1.setCompleted(true);
        toDo1.isCompleted();
        return toDoRepository.save(toDo);
    }

    @Override
    public void deleteToDo(String id) {
        ToDo toDo = new ToDo();
        toDoRepository.delete(toDo);
    }
}