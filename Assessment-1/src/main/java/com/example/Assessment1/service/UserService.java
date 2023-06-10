package com.example.Assessment1.service;

import com.example.Assessment1.dto.UserDTO;
import com.example.Assessment1.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private  UserRepository userRepository;



    public List<UserDTO> getAllActiveUsers() {
        return userRepository.findAllActiveUsers();
    }
}
