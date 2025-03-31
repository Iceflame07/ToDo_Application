package org.WalkingCompiler.todo_application.Services;
import org.WalkingCompiler.todo_application.Data.Models.User;
import org.WalkingCompiler.todo_application.Entity.UserEntity;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public interface UserService {

    User createUser(UserEntity userEntity);
    Optional<User> findUserByUsername(String username);
}