package org.WalkingCompiler.todo_application.Data.Repository;
import org.WalkingCompiler.todo_application.Data.Models.User;
import org.WalkingCompiler.todo_application.Entity.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {

    Optional<UserEntity> findByUsername(String username);
}
