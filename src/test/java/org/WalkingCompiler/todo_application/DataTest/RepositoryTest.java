package org.WalkingCompiler.todo_application.DataTest;
import org.WalkingCompiler.todo_application.Data.Models.ToDo;
import org.WalkingCompiler.todo_application.Data.Models.User;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class RepositoryTest {

    @Test
    public void testToDo() {
        ToDo toDo = new ToDo();
        toDo.setUserId(12);
        toDo.setTitle("");
        toDo.setDescription("");
        toDo.setCompleted(true);
        Assertions.assertEquals(12, toDo.getUserId());
        Assertions.assertEquals("", toDo.getTitle());
        Assertions.assertEquals("", toDo.getDescription());
        Assertions.assertTrue(true);
    }

    @Test
    public void testUser(){
        User use = new User();
        use.setId(12);
        use.setUsername("username");
        use.setPassword(use.getPassword());
        Assertions.assertEquals(12, use.getId());
        Assertions.assertEquals("username", use.getUsername());
    }
}
