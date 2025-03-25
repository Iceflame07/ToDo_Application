package org.WalkingCompiler.todo_application.DataTest;
import org.WalkingCompiler.todo_application.Data.Models.ToDo;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class modelTest {

    @Test
    public void testToDoModel() {
       ToDo task = new ToDo();
       task.setAddTask("");
       task.setEditTask("");
       task.setUpdateTask("");
       task.setDeleteTask("");
       Assertions.assertEquals("", task.getAddTask());
       Assertions.assertEquals("", task.getEditTask());
       Assertions.assertEquals("", task.getUpdateTask());
       Assertions.assertEquals("", task.getDeleteTask());
    }
}
