package world.app.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import world.app.core.model.User;
import world.app.core.repository.UserRepository;

import java.util.List;

@Controller
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:5173")
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @GetMapping
    @ResponseBody
    public List<User> list() {
        return userRepository.getAllUsers();
    }

    @PostMapping
    @ResponseBody
    public User create(@RequestBody User newUser) {
        return userRepository.create(newUser);
    }
}
