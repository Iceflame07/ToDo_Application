package org.WalkingCompiler.todo_application.Data.Repository;
import org.WalkingCompiler.todo_application.DTO.Response.SignUpResponse;
import org.WalkingCompiler.todo_application.DTO.Response.loginResponse;
import org.WalkingCompiler.todo_application.ToDoApplication;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends MongoRepository <ToDoApplication, String> {

    ToDoApplication viewTask();
    ToDoApplication findAddTask();
    ToDoApplication findEditTask();
    ToDoApplication findUpdateTask();
    ToDoApplication findDelete();
    ToDoApplication login(loginResponse request, String userName);
    ToDoApplication SignUp(SignUpResponse request, String userName);
}
