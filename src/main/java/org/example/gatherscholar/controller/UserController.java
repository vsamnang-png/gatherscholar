package org.example.gatherscholar.controller;

import org.example.gatherscholar.entity.User;
import org.example.gatherscholar.logic.UserLogic;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserLogic userLogic;

    public UserController(UserLogic userLogic) {
        this.userLogic = userLogic;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userLogic.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userLogic.getUserById(id);
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userLogic.saveUser(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userLogic.deleteUser(id);
    }
}
