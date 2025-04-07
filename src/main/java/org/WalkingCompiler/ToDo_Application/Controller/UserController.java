package org.WalkingCompiler.ToDo_Application.Controller;
import org.WalkingCompiler.ToDo_Application.DTO.Request.LoginRequest;
import org.WalkingCompiler.ToDo_Application.DTO.Request.SignUpRequest;
import org.WalkingCompiler.ToDo_Application.Data.Models.User;
import org.WalkingCompiler.ToDo_Application.Data.Repository.UserRepository;
import org.WalkingCompiler.ToDo_Application.Services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/User")
public class UserController {

    private UserRepository userRepository;
    private UserService userService;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/createUser")
    public ResponseEntity<UserRepository> createUser(@RequestBody UserRepository userRepository) {
        UserRepository savedUser = (UserRepository) userService.createUser((SignUpRequest) userRepository);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    @GetMapping("/findByUserName")
    public ResponseEntity<Optional<User>> findByUserName(@PathVariable UserRepository userRepository) {
        Optional<User> userName = userService.findByUserName(String.valueOf(userRepository));
        return new ResponseEntity<>(userName, HttpStatus.OK);
    }

    @GetMapping("/loginUser")
    public ResponseEntity<UserRepository> loginUser(@PathVariable UserRepository userRepository) {
        UserRepository login = (UserRepository) userService.loginUser((LoginRequest) userRepository);
        return new ResponseEntity<>(login, HttpStatus.OK);
    }
}