package org.WalkingCompiler.todo_application.Services;
import org.WalkingCompiler.todo_application.DTO.Response.SignUpResponse;
import org.WalkingCompiler.todo_application.DTO.Response.loginResponse;
import org.springframework.stereotype.Service;

@Service
public interface ToDoService {

    SignUpResponse SignUp(SignUpResponse request);
    loginResponse login(loginResponse request);
}
