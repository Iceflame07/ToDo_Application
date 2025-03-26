package org.WalkingCompiler.todo_application.Data.Repository;
import org.WalkingCompiler.todo_application.ToDoApplication;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends MongoRepository <ToDoApplication, String> {

    ToDoApplication findByViewTask(String viewTask);
    ToDoApplication findByAddTask(String addTask);
    ToDoApplication findByEditTask(String editTask);
    ToDoApplication findByUpdateTask(String updateTask);
    ToDoApplication findByDeleteTask(String delete);
}
