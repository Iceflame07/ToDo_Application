package org.WalkingCompiler.ToDo_Application.Data.Repository;
import org.WalkingCompiler.ToDo_Application.Data.Models.ToDo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ToDoRepository extends MongoRepository<ToDo, String> {

    List<ToDo> findByUserId(String userId);
}