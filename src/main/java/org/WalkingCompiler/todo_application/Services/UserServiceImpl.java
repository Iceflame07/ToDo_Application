package org.WalkingCompiler.todo_application.Services;
import org.WalkingCompiler.todo_application.Data.Models.User;
import org.WalkingCompiler.todo_application.Data.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserRepository userName(User userName) {
        return userRepository.userName(userName);
    }

    @Override
    public UserRepository password(User password) {
        return userRepository.password(password);
    }

    @Override
    public UserRepository save(User userName, String password) {
        if(userName.getUserName() == "") {
            userName.setUserName(String.valueOf(userName));
        } else if(userName.getPassword() == password) {
            password.length();
        }
        return userRepository.save(userName,password);
    }
}
