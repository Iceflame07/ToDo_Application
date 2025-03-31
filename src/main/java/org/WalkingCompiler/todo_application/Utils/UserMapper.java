package org.WalkingCompiler.todo_application.Utils;
import org.WalkingCompiler.todo_application.Data.Models.User;
import org.WalkingCompiler.todo_application.Entity.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User entityToUser(UserEntity entity) {
        User user = new User();
        user.setId(Integer.parseInt(entity.getId()));
        user.setUsername(entity.getUsername());
        return user;
    }
}