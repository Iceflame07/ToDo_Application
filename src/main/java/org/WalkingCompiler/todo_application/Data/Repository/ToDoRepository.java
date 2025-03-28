package org.WalkingCompiler.todo_application.Data.Repository;
import org.WalkingCompiler.todo_application.Data.Models.ToDo;
import org.WalkingCompiler.todo_application.ToDoApplication;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends MongoRepository <ToDoApplication, String> {

    ToDoApplication findAll(ToDo findAll);
    ToDoApplication insert(ToDo create);
    ToDoApplication save(ToDo title);
    ToDo delete(ToDo delete);
}


