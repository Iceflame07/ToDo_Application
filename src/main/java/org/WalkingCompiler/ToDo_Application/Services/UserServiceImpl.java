package org.WalkingCompiler.ToDo_Application.Services;
import org.WalkingCompiler.ToDo_Application.DTO.Request.LoginRequest;
import org.WalkingCompiler.ToDo_Application.DTO.Request.SignUpRequest;
import org.WalkingCompiler.ToDo_Application.DTO.Response.LoginResponse;
import org.WalkingCompiler.ToDo_Application.DTO.Response.SignUpResponse;
import org.WalkingCompiler.ToDo_Application.Data.Models.User;
import org.WalkingCompiler.ToDo_Application.Data.Repository.UserRepository;
import org.WalkingCompiler.ToDo_Application.Utils.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public SignUpResponse createUser(SignUpRequest signUpRequest) {
        User user = userMapper.mapToSignUpRequest(
                signUpRequest.getUsername(),
                signUpRequest.getPassword()
        );

        User savedUser = userRepository.save(user);

        return userMapper.mapToSignUpResponse(savedUser, "User created successfully");
    }

    @Override
    public Optional<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public LoginResponse loginUser(LoginRequest loginRequest) {
        User user = userMapper.mapToLoginRequest(loginRequest);
        String mockToken = "generated token";
        return userMapper.mapToLoginResponse(user, mockToken);
    }
}