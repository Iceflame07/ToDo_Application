package org.WalkingCompiler.todo_application.Services;
import org.WalkingCompiler.todo_application.Data.Models.User;
import org.WalkingCompiler.todo_application.Data.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public Optional<User> userName(User userName) {
        return userRepository.findByUsername(String.valueOf(userName));
    }

    @Override
    public UserRepository password() {
        return password();
    }

    @Override
    public UserRepository save(User userName, String password) {
        if(userName.getUserName() == "") {
            userName.setUserName(String.valueOf(userName));
        } else if(userName.getPassword() == password) {
            password.length();
        }
        return userRepository.save(userName, password);
    }
}
