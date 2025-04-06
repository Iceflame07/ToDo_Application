package org.WalkingCompiler.ToDo_Application.Controller;
import lombok.AllArgsConstructor;
import org.WalkingCompiler.ToDo_Application.Data.Models.ToDo;
import org.WalkingCompiler.ToDo_Application.Data.Repository.ToDoRepository;
import org.WalkingCompiler.ToDo_Application.Services.ToDoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@Controller("api/ToDo")
public class ToDoController {

    private final ToDoService toDoService;

    @PostMapping("/createToDo")
    public ResponseEntity<ToDoRepository> createToDo(@RequestBody ToDoRepository toDo){
        ToDoRepository savedToDo = (ToDoRepository) toDoService.createToDo((ToDo) toDo);
        return new ResponseEntity<>(savedToDo, HttpStatus.CREATED);
    }

    @GetMapping("/{Id}")
    public ResponseEntity<ToDoRepository> getToDoById(@PathVariable("id") int toDoId){
        ToDoRepository toDoRepository = (ToDoRepository) toDoService.getToDoById(String.valueOf(toDoId));
        return ResponseEntity.ok(toDoRepository);
    }

    @GetMapping("/UserId")
    public ResponseEntity<ToDoRepository> findByUserId(@PathVariable("id") int toDoUserId){
        ToDoRepository toDoRepository = (ToDoRepository) toDoService.findByUserId(String.valueOf(toDoUserId));
        return ResponseEntity.ok(toDoRepository);
    }

    @PostMapping("/updateToDo")
    public ResponseEntity<ToDoRepository> updateToDo(@RequestBody ToDoRepository toDoRepository){
        ToDoRepository updateToDo = (ToDoRepository) toDoService.updateToDo((ToDo) toDoRepository);
        return new ResponseEntity<>(updateToDo, HttpStatus.OK);
    }

    @PostMapping("/deleteToDo")
    public ResponseEntity<ToDoRepository> deleteToDo(@RequestBody ToDoRepository toDoRepository){
        ToDoRepository deleteToDo = toDoService.deleteToDo(toDoRepository.toString());
        return new ResponseEntity<>(deleteToDo, HttpStatus.OK);
    }
}