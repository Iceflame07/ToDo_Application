package org.WalkingCompiler.todo_application.Services;
import org.WalkingCompiler.todo_application.Data.Models.ToDo;
import org.WalkingCompiler.todo_application.Data.Repository.ToDoRepository;
import org.WalkingCompiler.todo_application.ToDoApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.Instant;

@Service
public class ToDoServiceImpl implements ToDoService{

    @Autowired
    private ToDoRepository toDoRepository;

    @Override
    public ToDoApplication findAll(ToDo findAll) {
        return (ToDoApplication) toDoRepository.findAll();
    }

    @Override
    public ToDoApplication insert(ToDo create){
        return toDoRepository.insert(create);
    }

    @Override
    public ToDoApplication save(ToDo title){
        if(title.getTitle() == null){
            title.setCreatedAt(Instant.now());
        }
        title.setUpdatedAt(Instant.now());
        return toDoRepository.save(title);
    }

    @Override
    public ToDo delete(ToDo delete){
        toDoRepository.delete(delete);
        return delete;
    }

    @Override
    public String getAll() {
        return "";
    }
}
