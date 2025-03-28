package org.WalkingCompiler.todo_application.Data.Repository;
import org.WalkingCompiler.todo_application.Data.Models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

    Optional<User> findByUsername(String username);
    UserRepository save(User userName, String password);
}