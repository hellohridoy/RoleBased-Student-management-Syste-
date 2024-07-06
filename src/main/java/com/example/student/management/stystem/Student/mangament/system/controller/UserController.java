package com.example.student.management.stystem.Student.mangament.system.controller;

import com.example.student.management.stystem.Student.mangament.system.entity.User;
import com.example.student.management.stystem.Student.mangament.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@CrossOrigin(
        origins = {"http://localhost:4200"}
)
@RequestMapping("student-management-system/user")
@RestController
public class UserController {
    @Autowired
    private UserService userService;


    @GetMapping("/all")
    public List<User> all() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @PostMapping("/add-users")
    public User addUsers(@RequestBody User member) {
        return userService.addUser(member);
    }

    @PutMapping("/{id}")
    public User updateMember(@PathVariable Long id, @RequestBody User user) {
        return userService.updateUser(id, user);
    }

    @DeleteMapping("/delete/{id}")
    public void  deleteMember(@PathVariable Long id) {
        userService.deleteUser(id);
    }

}
