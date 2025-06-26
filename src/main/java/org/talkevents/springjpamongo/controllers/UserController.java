package org.talkevents.springjpamongo.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.talkevents.springjpamongo.documents.User;
import org.talkevents.springjpamongo.services.UserService;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(userService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable String id) {
        return ResponseEntity.ok(userService.getById(id));
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(user));
    }

    @PutMapping
    public ResponseEntity<Void> updateUser(@RequestBody User user) {
        userService.update(user);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable String id) {
        userService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
