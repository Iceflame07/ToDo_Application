package org.WalkingCompiler.todo_application.Services;
import org.WalkingCompiler.todo_application.DTO.Response.SignUpResponse;
import org.WalkingCompiler.todo_application.DTO.Response.loginResponse;
import org.WalkingCompiler.todo_application.Data.Repository.ToDoRepository;
import org.WalkingCompiler.todo_application.ToDoApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToDoServiceImpl implements ToDoService {

    @Autowired
    private static ToDoRepository toDoRepository;

    public ToDoServiceImpl(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    @Override
    public SignUpResponse SignUp(SignUpResponse request) {
        String userName = request.getUserName();
        String password = request.getPassword();
        SignUpResponse response = new SignUpResponse();
        return SignUp(response);
    }

    @Override
    public loginResponse login(loginResponse request) {
        String userName = request.getUserName();
        String password = request.getPassword();
        loginResponse response = new loginResponse();
        return login(response);
    }

    public ToDoApplication getByViewTask(String viewTask) {
        return toDoRepository.findByViewTask(viewTask);
    }

    public ToDoApplication getByAddTask(String addTask) {
        return toDoRepository.findByAddTask(addTask);
    }

    public ToDoApplication getByEditTask(String editTask){
        return toDoRepository.findByEditTask(editTask);
    }

    public ToDoApplication getByUpdateTask(String updateTask){
        return toDoRepository.findByUpdateTask(updateTask);
    }

    public ToDoApplication getByDeleteTask(String deleteTask) {
        return toDoRepository.findByDeleteTask(deleteTask);
    }
}