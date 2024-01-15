package com.example.demo.service;

import com.example.demo.model.Userc;
import com.example.demo.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public List<Userc> users() {
        EmailHandler.sendEmail("dk438916@gmail.com","subject","hyy there what is going on");
        return userRepo.findAll();
    }

    public Userc addUser(Userc user) {
        userRepo.save(user);
        return user;
    }
}
