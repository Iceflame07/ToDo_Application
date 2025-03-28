package org.WalkingCompiler.todo_application.Controller;
import org.WalkingCompiler.todo_application.Data.Models.User;
import org.WalkingCompiler.todo_application.Data.Repository.UserRepository;
import org.apache.catalina.connector.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping
    public User userName(@RequestBody String userName) {
        return
    }

    @GetMapping("/login")
    public House loginHouse(@RequestBody Request loginRequest) {
        return houseService.login(loginRequest);
    }
}
