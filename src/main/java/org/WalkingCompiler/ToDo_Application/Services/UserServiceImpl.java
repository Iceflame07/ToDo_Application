package org.WalkingCompiler.ToDo_Application.Services;
import lombok.AllArgsConstructor;
import org.WalkingCompiler.ToDo_Application.DTO.Request.LoginRequest;
import org.WalkingCompiler.ToDo_Application.DTO.Request.SignUpRequest;
import org.WalkingCompiler.ToDo_Application.DTO.Response.LoginResponse;
import org.WalkingCompiler.ToDo_Application.DTO.Response.SignUpResponse;
import org.WalkingCompiler.ToDo_Application.Data.Models.User;
import org.WalkingCompiler.ToDo_Application.Data.Repository.UserRepository;
import org.WalkingCompiler.ToDo_Application.Utils.UserMapper;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public User createUser(SignUpRequest User) {
        User user = userMapper.mapSignUpRequestToUser(User);
        User savedUser = userRepository.save(user);
        return UserMapper.mapToLoginRequestToUser(savedUser);
    }

    @Override
    public Optional<User> findByUserName(SignUpRequest userName) {
        User user = userMapper.mapUserToUser(String.valueOf(userName));
        User savedUser = userRepository.save(user);
        return userRepository.findByUsername(savedUser.getUsername());
    }

    @Override
    public User loginUser(LoginRequest loginRequest) {
        Optional<User> userOptional = userRepository.findByUsername(loginRequest.getUsername());
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            if (user.getPassword().equals(loginRequest.getPassword())) {
                return user;
            }
        }
        throw new RuntimeException("Invalid username or password");
    }

    @Override
    public User loginUserResponse(LoginResponse loginResponse){
        User user = userMapper.mapLoginResponse(loginResponse);
        User message = userRepository.save(user);
        return userRepository.save(message);
    }

    @Override
    public User SignUpResponse(SignUpResponse signUpResponse) {
        User user = userMapper.mapSignUpResponseToUser(signUpResponse);
        User message = userRepository.save(user);
        return userRepository.save(message);
    }
}