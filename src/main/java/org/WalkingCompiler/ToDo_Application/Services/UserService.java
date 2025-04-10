package org.WalkingCompiler.ToDo_Application.Services;
import org.WalkingCompiler.ToDo_Application.DTO.Request.LoginRequest;
import org.WalkingCompiler.ToDo_Application.DTO.Request.SignUpRequest;
import org.WalkingCompiler.ToDo_Application.DTO.Response.LoginResponse;
import org.WalkingCompiler.ToDo_Application.DTO.Response.SignUpResponse;
import org.WalkingCompiler.ToDo_Application.Data.Models.User;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public interface UserService {

    User createUser(SignUpRequest User);
    Optional<User> findByUserName(SignUpRequest userName);
    User loginUser(LoginRequest loginRequest);
    User loginUserResponse(LoginResponse loginResponse);
    User SignUpResponse(SignUpResponse signUpResponse);
}