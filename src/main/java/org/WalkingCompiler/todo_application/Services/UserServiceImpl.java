package org.WalkingCompiler.todo_application.Services;
import org.WalkingCompiler.todo_application.Data.Models.User;
import org.WalkingCompiler.todo_application.Data.Repository.UserRepository;
import org.WalkingCompiler.todo_application.Entity.UserEntity;
import org.WalkingCompiler.todo_application.Utils.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    @Override
    public User createUser(UserEntity userEntity) {
        return userMapper.entityToUser(userRepository.save(userEntity));
    }

    @Override
    public Optional<User> findUserByUsername(String username) {
        return userRepository.findByUsername(username).map(userMapper, entityToUser);
    }
}