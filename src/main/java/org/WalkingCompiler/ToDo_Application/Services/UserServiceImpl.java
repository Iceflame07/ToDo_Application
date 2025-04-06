package org.WalkingCompiler.ToDo_Application.Services;
import lombok.AllArgsConstructor;
import org.WalkingCompiler.ToDo_Application.DTO.Request.LoginRequest;
import org.WalkingCompiler.ToDo_Application.DTO.Request.SignUpRequest;
import org.WalkingCompiler.ToDo_Application.Data.Models.User;
import org.WalkingCompiler.ToDo_Application.Data.Repository.UserRepository;
import org.WalkingCompiler.ToDo_Application.Utils.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    private UserMapper userMapper;

    @Override
    public UserRepository createUser(SignUpRequest signUpRequest) {
        return null;
    }

    @Override
    public Optional<User> findByUserName(String username) {
        return Optional.empty();
    }

    @Override
    public UserRepository loginUser(LoginRequest loginRequest) {
        return null;
    }
}