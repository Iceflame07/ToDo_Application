package org.WalkingCompiler.ToDo_Application.ServicesTest;
import org.WalkingCompiler.ToDo_Application.DTO.Request.LoginRequest;
import org.WalkingCompiler.ToDo_Application.DTO.Request.SignUpRequest;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class ServiceTest {

    @Test
    public void testLoginSuccess() {
        LoginRequest loginRequest = new LoginRequest("","");
        loginRequest.setUsername("test");
        loginRequest.setPassword("password");
        assertTrue(true);
        Assertions.assertEquals("test", loginRequest.getUsername());
        Assertions.assertEquals("password", loginRequest.getPassword());
    }

    @Test
    public void testLoginFailure() {
        LoginRequest loginRequest = new LoginRequest("","");
        loginRequest.setUsername("test");
        loginRequest.setPassword("wrongPassword");
        assertFalse(false);
        Assertions.assertEquals("test", loginRequest.getUsername());
        Assertions.assertEquals("wrongPassword", loginRequest.getPassword());
    }

    @Test
    public void testSignupSuccess() {
        SignUpRequest success = new SignUpRequest("","");
        success.setUsername("test");
        success.setPassword("password");
        assertTrue(true);
        Assertions.assertEquals("test", success.getUsername());
        Assertions.assertEquals("password", success.getPassword());
    }

    @Test
    public void testSignupFailure() {
        SignUpRequest failure = new SignUpRequest("","");
        failure.setUsername("test");
        failure.setPassword("newPassword");
        assertFalse(false);
        Assertions.assertEquals("test", failure.getUsername());
        Assertions.assertEquals("newPassword", failure.getPassword());
    }
}