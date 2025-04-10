package org.WalkingCompiler.ToDo_Application.Utils;
import org.WalkingCompiler.ToDo_Application.DTO.Request.SignUpRequest;
import org.WalkingCompiler.ToDo_Application.DTO.Response.LoginResponse;
import org.WalkingCompiler.ToDo_Application.DTO.Response.SignUpResponse;
import org.WalkingCompiler.ToDo_Application.Data.Models.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public static User mapToLoginRequestToUser(User user) {
        return new User(
                "",
                ""
        );
    }


    public static User mapUserToUser(String findByUserName) {
        return new User(
                "",
                ""
        );
    }

    public static User mapSignUpRequestToUser(SignUpRequest signUpRequest) {
        return new User(
                "",
                ""
        );
    }

    public static User mapLoginResponse(LoginResponse loginResponse) {
        return new User(
                "",
                ""
        );
    }

    public static User mapSignUpResponseToUser(SignUpResponse signUpResponse) {
        return new User(
                "",
                ""
        );
    }
}