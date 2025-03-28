package org.WalkingCompiler.todo_application.Services;
import org.WalkingCompiler.todo_application.Data.Models.User;
import org.WalkingCompiler.todo_application.Data.Repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface UserService {

    Optional<User> userName(User userName);
    UserRepository password();
    UserRepository save(User signUp, String password);
}
