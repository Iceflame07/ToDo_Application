package org.WalkingCompiler.todo_application.ServicesTest;
import org.WalkingCompiler.todo_application.DTO.Request.SignUpRequest;
import org.WalkingCompiler.todo_application.DTO.Response.SignUpResponse;
import org.WalkingCompiler.todo_application.DTO.Request.loginRequest;
import org.WalkingCompiler.todo_application.DTO.Response.loginResponse;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ServiceTest {

    @Test
    public void testThatSignUpRequestIsWorking() {
        SignUpRequest request = new SignUpRequest();
        request.setUserName("user");
        request.setPassword("password");
        Assertions.assertEquals("user", request.getUserName());
        Assertions.assertEquals("password", request.getPassword());
    }

    @Test
    public void testThatResponseIsWorking() {
        SignUpResponse response = new SignUpResponse();
        response.setMessage(response.getMessage());
        Assertions.assertTrue(true);
        Assertions.assertEquals("", response.getMessage());
    }

    @Test
    public void testThatLoginRequestIsWorking() {
        loginRequest request = new loginRequest();
        request.setUsername("");
        request.setPassword("");
        Assertions.assertEquals("", request.getUsername());
        Assertions.assertEquals("", request.getPassword());
    }

    @Test
    public void testThatLoginResponseIsWorking() {
        loginResponse response = new loginResponse();
        response.setMessage(response.getMessage());
        Assertions.assertTrue(true);
        Assertions.assertEquals("", response.getMessage());
    }
}
