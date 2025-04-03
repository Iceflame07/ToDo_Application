package org.WalkingCompiler.ToDo_Application.DataTest;
import org.WalkingCompiler.ToDo_Application.Data.Models.User;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class RepositoryTest {


    @Test
    public void testThatUserRepositoryCanFindByUsername() {
        User use = new User();
        use.setUsername("username");
        Assertions.assertEquals("username", use.getUsername());
    }

    @Test
    public void testUserRepositoryFindByUsernameWasNotFound() {
        User use = new User();
        use.setUsername("UsernameNotFound");
        Assertions.assertNull(use.getUsername());
    }
}