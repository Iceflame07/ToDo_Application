package org.WalkingCompiler.ToDo_Application.Utils;
import ch.qos.logback.core.model.Model;
import org.WalkingCompiler.ToDo_Application.Data.Models.User;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public static User mapToUser(User user) {
        return new User(
                "",
                "",
                ""
        );
    }

    @NotNull
    @Contract("_, _ -> new")
    public static User mapToUser(User user, Model model) {
        return new User(
                "",
                "",
                ""
        );
    }
}