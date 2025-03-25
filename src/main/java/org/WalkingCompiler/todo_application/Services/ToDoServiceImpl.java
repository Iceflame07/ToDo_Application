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
    private ToDoRepository toDoRepository;

    @Override
    public SignUpResponse SignUp(SignUpResponse request) {
        request = new SignUpResponse();
        ToDoApplication userName = toDoRepository.SignUp(request, SignUpResponse.getUserName());
        ToDoApplication Password = toDoRepository.SignUp(request, SignUpResponse.getPassword());
        return new SignUpResponse();
    }

    @Override
    public loginResponse login(loginResponse request) {
        request = new loginResponse();
        ToDoApplication userName = toDoRepository.login(request, loginResponse.getUserName());
        ToDoApplication Password = toDoRepository.login(request, loginResponse.getPassword());
        return new loginResponse();
    }
}
