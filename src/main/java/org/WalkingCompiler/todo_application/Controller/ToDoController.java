package org.WalkingCompiler.todo_application.Controller;
import org.WalkingCompiler.todo_application.DTO.Request.ToDoRequest;
import org.WalkingCompiler.todo_application.DTO.Response.ToDoResponse;
import org.WalkingCompiler.todo_application.Data.Models.ToDo;
import org.WalkingCompiler.todo_application.Services.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@Controller
public class ToDoController {

    @Autowired
    private ToDoService toDoService;

    @PostMapping("/getAllToDos")
    public String getAllToDos(@RequestBody ToDo toDo) {
        String userId = "placeholder_user_id";
        List<ToDo> toDos = toDoService.getAllToDos(String.valueOf(toDo));
        return toDos.toString();
    }

    @PostMapping
    public Optional<ToDo> getToDoById(@RequestBody ToDo request){
        String user = "placeholder_user";
        Optional<ToDo> toDo = toDoService.getToDoById(String.valueOf(request), user);
        return toDo;
    }

    @PostMapping("/createToDo")
    public ResponseEntity<ToDoResponse> createToDo(@RequestBody ToDoRequest request) {
        String userId = "placeholder_user_id";
        ToDo toDo = toDoService.createToDo(request, userId);
        ToDoResponse response = new ToDoResponse();
        response.setToDo(toDo);
        response.setMessage("ToDo created successfully");
        return ResponseEntity.ok(response);
    }

    @PutMapping("/updateToDo")
    public ResponseEntity<ToDoResponse> updateToDo(@RequestBody ToDoRequest request) {
        String update = "placeholder_user_id";
        ToDo toDo = toDoService.updateToDo(request, update);
        ToDoResponse response = new ToDoResponse();
        response.setToDo(toDo);
        response.setMessage("Todo updated successfully");
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteTodo(@PathVariable String id) {
        String userId = "placeholder_user_id";
        toDoService.deleteToDo(id, userId);
        return ResponseEntity.ok().build();
    }
}