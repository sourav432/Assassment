package com.example.Assessment1.controller;

import com.example.Assessment1.dto.UserDTO;
import com.example.Assessment1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;



    @GetMapping
    public List<UserDTO> getAllActiveUsers() {
        return userService.getAllActiveUsers();
    }
}
