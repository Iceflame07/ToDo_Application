package org.WalkingCompiler.ToDo_Application.Controller;
import org.WalkingCompiler.ToDo_Application.DTO.Request.LoginRequest;
import org.WalkingCompiler.ToDo_Application.DTO.Request.SignUpRequest;
import org.WalkingCompiler.ToDo_Application.DTO.Response.LoginResponse;
import org.WalkingCompiler.ToDo_Application.DTO.Response.SignUpResponse;
import org.WalkingCompiler.ToDo_Application.Data.Models.User;
import org.WalkingCompiler.ToDo_Application.Data.Repository.UserRepository;
import org.WalkingCompiler.ToDo_Application.Services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;


@RestController
@RequestMapping("api/User")
@Controller
public class UserController {

    private UserService userService;
    private UserRepository userRepository;

    public UserController(UserService userService, UserRepository userRepository) {
        this.userService = userService;
        this.userRepository = userRepository;
    }

    @PostMapping("/createUser")
    public ResponseEntity<UserRepository> createUser(@RequestBody UserRepository userRepository) {
        UserRepository savedUser = (UserRepository) userService.createUser((SignUpRequest) userRepository);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    @GetMapping("/findByUserName")
    public ResponseEntity<Optional<User>> findByUserName(@PathVariable UserRepository User) {
        Optional<User> userName = userService.findByUserName((SignUpRequest) User);
        return new ResponseEntity<>(userName, HttpStatus.OK);
    }

    @PostMapping("/loginUser")
    public ResponseEntity<UserRepository> loginUser(@RequestBody UserRepository userRepository) {
        UserRepository login = (UserRepository) userService.loginUser((LoginRequest) userRepository);
        return new ResponseEntity<>(login, HttpStatus.OK);
    }

    @GetMapping("/loginUserResponse")
    public ResponseEntity<User> loginUserResponse(@PathVariable UserRepository userRepository) {
        User user = userService.loginUserResponse(LoginResponse.class.cast(userRepository));
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping("/SignUpResponse")
    public ResponseEntity<User> SignUpResponse(@PathVariable UserRepository userRepository) {
        User user = userService.SignUpResponse(SignUpResponse.class.cast(userRepository));
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}