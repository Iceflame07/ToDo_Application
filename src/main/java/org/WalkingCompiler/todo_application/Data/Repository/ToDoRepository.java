package org.WalkingCompiler.todo_application.Data.Repository;
import org.WalkingCompiler.todo_application.Data.Models.ToDo;
import org.WalkingCompiler.todo_application.ToDoApplication;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends MongoRepository <ToDoApplication, String> {

    ToDoApplication save();
    ToDoApplication insert(ToDo create);
    ToDoApplication delete(ToDo delete);
}
