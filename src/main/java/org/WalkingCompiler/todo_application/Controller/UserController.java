package org.WalkingCompiler.todo_application.Controller;
import org.WalkingCompiler.todo_application.Data.Models.User;
import org.WalkingCompiler.todo_application.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/")
    public User signUp(@RequestBody String signUp) {
        return signUp(signUp);
    }
}
