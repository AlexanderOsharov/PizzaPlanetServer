package org.example.controller;

import org.example.domain.User;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private final UserService service;

    @Autowired
    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping("/user") // на порт 8080 обратиться по... и прислать в json пользователся
    public User add(@RequestBody User user) {

        // как то логиа по обработк данных
        return service.add(user);
    }

    @GetMapping("/user")
    public List<User> getAll() {
        return service.getAll();
    }

    @GetMapping("/user/{id}")
    public User getById(@PathVariable long id) {
        return service.getById(id);
    }

    @PostMapping("/user/id")
    public User update(@RequestBody User user) {
        return service.update(user);
    }

    @DeleteMapping("/user/{id}")
    public void deleteByiId(@PathVariable long id) {
        service.deleteByiId(id);
    }
}
