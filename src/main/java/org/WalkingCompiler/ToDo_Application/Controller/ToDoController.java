package org.WalkingCompiler.ToDo_Application.Controller;
import org.WalkingCompiler.ToDo_Application.Data.Models.ToDo;
import org.WalkingCompiler.ToDo_Application.Services.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


@RestController
@Controller("api/ToDo")
public class ToDoController {

    private final ToDoService toDoService;

    @Autowired
    public ToDoController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    @PostMapping("/createToDo")
    public ResponseEntity<ToDo> createToDo(@RequestBody ToDo createToDo) {
        ToDo addedToDo = toDoService.createToDo(createToDo);
        return ResponseEntity.ok(addedToDo);
    }

    @PostMapping("/update")
    public ResponseEntity<ToDo> updateToDo(@RequestBody ToDo toDo) {
        ToDo updatedToDo = toDoService.updateToDo(toDo);
        return ResponseEntity.ok(updatedToDo);
    }

    @GetMapping("/getAllToDoById")
    public ResponseEntity<ToDo> getAllToDoById(@RequestBody String id) {
        Optional<ToDo> toDo = toDoService.getToDoById(id);
        if(toDo == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(getAllToDoById(id).getBody());
    }

    @PostMapping("/todos/user")
    public ResponseEntity<List<ToDo>> getAllToDoByUserId(@RequestBody String userId) {
        List<ToDo> allToDo = toDoService.getAllToDoByUserId(userId);
        if (allToDo == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(allToDo);
    }

    @PostMapping("/delete")
    public ResponseEntity<Void> deleteToDo(@RequestBody String id) {
        toDoService.deleteToDo(id);
        return ResponseEntity.noContent().build();
    }
}