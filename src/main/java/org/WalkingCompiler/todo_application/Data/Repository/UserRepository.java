package org.WalkingCompiler.todo_application.Data.Repository;
import org.WalkingCompiler.todo_application.DTO.Request.SignUpRequest;
import org.WalkingCompiler.todo_application.DTO.Request.loginRequest;
import org.WalkingCompiler.todo_application.Data.Models.User;
import org.WalkingCompiler.todo_application.ToDoApplication;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<ToDoApplication, String> {

    loginRequest login(loginRequest request);
    SignUpRequest SignUp(SignUpRequest request);
    UserRepository userName(User userName);
    UserRepository password(User password);
    UserRepository save(User userName, String password);
}
