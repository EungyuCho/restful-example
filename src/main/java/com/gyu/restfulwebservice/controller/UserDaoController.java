package com.gyu.restfulwebservice.controller;

import com.gyu.restfulwebservice.model.User;
import com.gyu.restfulwebservice.service.UserDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserDaoController {
    private UserDaoService userDaoService;

    public UserDaoController(UserDaoService userDaoService) {
        this.userDaoService = userDaoService;
    }

    @GetMapping("/user")
    public List<User> findAllUsers() {
        return userDaoService.findAll();
    }

    @GetMapping("/user/{id}")
    public User findUser(@PathVariable Long id) {
        return userDaoService.findOne(id);
    }

}
