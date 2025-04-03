package org.WalkingCompiler.ToDo_Application.Utils;
import org.WalkingCompiler.ToDo_Application.DTO.Request.LoginRequest;
import org.WalkingCompiler.ToDo_Application.DTO.Response.LoginResponse;
import org.WalkingCompiler.ToDo_Application.DTO.Response.SignUpResponse;
import org.WalkingCompiler.ToDo_Application.Data.Models.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User mapToSignUpRequest(String username, String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        return user;
    }

    public SignUpResponse mapToSignUpResponse(User savedUser, String message) {
        User user = new User();
        user.setUsername(savedUser.getUsername());
        return new SignUpResponse();
    }

    public User mapToLoginRequest(LoginRequest loginRequest) {
        User user = new User();
        user.setUsername(loginRequest.getUsername());
        user.setPassword(loginRequest.getPassword());
        return user;
    }

    public LoginResponse mapToLoginResponse(User user, String token) {
        User user1 = new User();
        user1.setUsername(user.getUsername());
        return new LoginResponse(user.getUsername(), token, "Login successful");
    }
}