package org.WalkingCompiler.todo_application.Services;
import org.WalkingCompiler.todo_application.Data.Models.User;
import org.WalkingCompiler.todo_application.Data.Repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    UserRepository userName(User userName);
    UserRepository password(User password);
    UserRepository save(User userName, String password);
}
