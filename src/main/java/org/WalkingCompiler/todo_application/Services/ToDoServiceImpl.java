package org.WalkingCompiler.todo_application.Services;
import org.WalkingCompiler.todo_application.DTO.Request.ToDoRequest;
import org.WalkingCompiler.todo_application.Data.Models.ToDo;
import org.WalkingCompiler.todo_application.Data.Repository.ToDoRepository;
import org.WalkingCompiler.todo_application.Entity.ToDoEntity;
import org.WalkingCompiler.todo_application.Utils.ToDoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class ToDoServiceImpl implements ToDoService{

    @Autowired
    private ToDoRepository toDoRepository;

    @Autowired
    private ToDoMapper toDoMapper;

    @Override
    public ToDo createToDo(ToDoRequest request, String userId) {
        ToDoEntity entity = ToDoMapper.requestToEntity(request, userId);
        return ToDoMapper.entityToToDo(toDoRepository.save(entity));
    }

    @Override
    public List<ToDo> getAllToDos(String userId) {
        List<ToDo> list = new ArrayList<>();
        ToDoMapper toDoMapper = toDoMapper;
        for (ToDoEntity toDoEntity : toDoRepository.findByUserId(userId)) {
            ToDo toDo = ToDoMapper.entityToToDo(toDoEntity);
            list.add(toDo);
        }
        return list;
    }

    @Override
    public Optional<ToDo> getToDoById(String id, String userId) {
        return toDoRepository.findById(id).map(toDoMapper, entityToToDo);
    }

    @Override
    public ToDo updateToDo(String id, ToDoRequest request, String userId) {
        ToDoEntity entity = toDoRepository.findById(id).filter(toDoEntity -> toDoEntity.getUserId().equals(userId)).orElse(null);
        if (entity != null) {
            entity.setTitle(request.getTitle());
            entity.setDescription(request.getDescription());
            return ToDoMapper.entityToToDo(toDoRepository.save(entity));
        }
        return null;
    }

    @Override
    public void deleteToDo(String id, String userId) {
        toDoRepository.findById(id).filter(todoEntity -> todoEntity.getUserId().equals(userId));
    }
}
