package org.WalkingCompiler.ToDo_Application.Utils;
import org.WalkingCompiler.ToDo_Application.DTO.Request.SignUpRequest;
import org.WalkingCompiler.ToDo_Application.Data.Models.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public static User mapToLoginRequestToUser(User loginRequest) {
        return new User(
                "",
                "",
                ""
        );
    }


    public static User mapToUser(String findByUserName) {
        return new User(
                "",
                "",
                ""
        );
    }

    public User mapSignUpRequestToUser(SignUpRequest signUpRequest) {
        return new User(
                "",
                "",
                ""
        );
    }
}