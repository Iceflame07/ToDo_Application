package org.WalkingCompiler.todo_application.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UserEntity {

    private String username;
    private String password;

    public UserEntity(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User(username='" + username + "')";
    }
}