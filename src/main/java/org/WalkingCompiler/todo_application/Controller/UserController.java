package org.WalkingCompiler.todo_application.Controller;
import org.WalkingCompiler.todo_application.DTO.Request.SignUpRequest;
import org.WalkingCompiler.todo_application.DTO.Response.loginResponse;
import org.WalkingCompiler.todo_application.Data.Models.User;
import org.WalkingCompiler.todo_application.Entity.UserEntity;
import org.WalkingCompiler.todo_application.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Optional;

@RestController
@RequestMapping("/User")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/loginResponse")
    public ResponseEntity<String> loginResponse(@RequestBody loginResponse response) {
        Optional<User> login = userService.findUserByUsername(String.valueOf(response));
        return ResponseEntity.ok("message");
    }

    @PostMapping("/signUp")
    public ResponseEntity<SignUpRequest> signUpRequest(@RequestBody SignUpRequest request) {
        UserEntity userEntity = new UserEntity();
        Optional<User> SignUp = Optional.ofNullable(userService.createUser(request));
        return ResponseEntity.ok(request);
    }
}