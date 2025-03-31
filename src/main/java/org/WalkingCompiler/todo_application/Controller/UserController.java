package org.WalkingCompiler.todo_application.Controller;
import org.WalkingCompiler.todo_application.DTO.Request.SignUpRequest;
import org.WalkingCompiler.todo_application.DTO.Response.SignUpResponse;
import org.WalkingCompiler.todo_application.DTO.Response.loginResponse;
import org.WalkingCompiler.todo_application.Data.Repository.UserRepository;
import org.WalkingCompiler.todo_application.Entity.UserEntity;
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
    private UserRepository userRepository;

    @PostMapping("/loginResponse")
    public ResponseEntity<String> loginResponse(@RequestBody loginResponse response) {
        Optional<UserEntity> login = userRepository.findByUsername(String.valueOf(response));
        return ResponseEntity.ok("message");
    }

    @PostMapping("/signup")
    public ResponseEntity<SignUpResponse> signup(@RequestBody SignUpRequest signupRequest) {
        UserEntity userEntity = new UserEntity();
        return ResponseEntity.ok(signUpResponse);
    }
}