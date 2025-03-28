package org.WalkingCompiler.todo_application.Services;
import org.WalkingCompiler.todo_application.Data.Models.ToDo;
import org.WalkingCompiler.todo_application.Data.Models.User;
import org.WalkingCompiler.todo_application.Data.Repository.ToDoRepository;
import org.WalkingCompiler.todo_application.Data.Repository.UserRepository;
import org.WalkingCompiler.todo_application.ToDoApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.Instant;
import java.util.List;

@Service
public class ToDoServiceImpl {

    @Autowired
    private ToDoRepository toDoRepository;
    private UserRepository userRepository;

    public List<ToDoApplication> findAll(){
        return toDoRepository.findAll();
    }

    public ToDoApplication insert(ToDo create){
        return toDoRepository.insert(create);
    }

    public ToDoApplication save(ToDo title){
        if(title.getTitle() == null){
            title.setCreatedAt(Instant.now());
        }
           title.setUpdatedAt(Instant.now());
        return toDoRepository.save();
    }

    public ToDo delete(ToDo delete){
        toDoRepository.delete(delete);
        return delete;
    }

    public UserRepository userName(User userName) {
        return userRepository.userName(userName);
    }

    public UserRepository password(User password) {
        return userRepository.password(password);
    }

    public UserRepository save(User userName, String password) {
        if(userName.getUserName() == "") {
            userName.setUserName(String.valueOf(userName));
        } else if(userName.getPassword() == password) {
            password.length();
        }
        return userRepository.save(userName,password);
    }
}
