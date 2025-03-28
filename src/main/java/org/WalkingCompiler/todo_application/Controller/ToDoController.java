package org.WalkingCompiler.todo_application.Controller;
import org.WalkingCompiler.todo_application.Data.Models.ToDo;
import org.WalkingCompiler.todo_application.Services.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@Controller
public class ToDoController {

    @Autowired
    private ToDoService toDoService;

    @GetMapping("/")
    public ModelAndView ModelAndView (){
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("todo", toDoService.getAll());
        return modelAndView;
    }

    @GetMapping("/create-todo")
    public String showForm(ToDo toDo) {
        return "new todo";
    }
}
