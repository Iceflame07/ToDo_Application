package org.WalkingCompiler.todo_application.Data.Repository;
import org.WalkingCompiler.todo_application.ToDoApplication;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepository extends MongoRepository <ToDoApplication, String> {

    String userName = "";
    String password = "";
}
