package org.WalkingCompiler.todo_application.Controller;
import org.WalkingCompiler.todo_application.DTO.Request.ToDoRequest;
import org.WalkingCompiler.todo_application.DTO.Response.ToDoResponse;
import org.WalkingCompiler.todo_application.Data.Models.ToDo;
import org.WalkingCompiler.todo_application.Data.Models.User;
import org.WalkingCompiler.todo_application.Data.Repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@Controller
public class ToDoController {

    @Autowired
    private ToDoRepository toDoRepository;

    @GetMapping("/findAll")
    public String findAll(ToDo toDo) {
        List<ToDo> toDos = toDoRepository.findAll(User.getId());
        toDos.add((ToDo) toDos);
        return toDos.toString();
    }

    @PostMapping("/createToDo")
    public ResponseEntity<ToDoResponse> createToDo(@RequestBody ToDoRequest request) {
        ToDo toDo = toDoRepository.save(request, User.getId());
        ToDoResponse response = new ToDoResponse();
        response.setToDo(toDo);
        response.setMessage("ToDo created successfully");
        return ResponseEntity.ok(response);
    }

    @PutMapping("/updateToDo")
    public ResponseEntity<ToDoResponse> updateToDo(@PathVariable String id, @RequestBody ToDoRequest request) {
        ToDo todo = toDoRepository.updateToDo(id, request, User.getId());
        ToDoResponse response = new ToDoResponse();
        response.setToDo(todo);
        response.setMessage("Todo updated successfully");
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Void> deleteTodo(@PathVariable String id) {
        toDoRepository.deleteToDo(id, User.getId());
        return ResponseEntity.ok().build();
    }
}