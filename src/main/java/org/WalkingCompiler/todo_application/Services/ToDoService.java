package org.WalkingCompiler.todo_application.Services;
import org.WalkingCompiler.todo_application.Data.Models.ToDo;
import org.WalkingCompiler.todo_application.ToDoApplication;

public interface ToDoService {
    ToDoApplication findAll(ToDo findAll);
    ToDoApplication insert(ToDo create);
    ToDoApplication save(ToDo title);
    ToDo delete(ToDo delete);
    String getAll();
}