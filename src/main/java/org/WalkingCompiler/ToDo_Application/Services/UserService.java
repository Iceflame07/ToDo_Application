package org.WalkingCompiler.ToDo_Application.Services;
import org.WalkingCompiler.ToDo_Application.DTO.Request.LoginRequest;
import org.WalkingCompiler.ToDo_Application.DTO.Request.SignUpRequest;
import org.WalkingCompiler.ToDo_Application.Data.Models.User;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface UserService {

    User createUser(SignUpRequest signUpRequest);
    Optional<User> findByUserName(String username);
    User loginUser(LoginRequest loginRequest);
}