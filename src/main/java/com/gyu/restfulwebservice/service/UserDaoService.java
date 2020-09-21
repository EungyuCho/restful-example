package com.gyu.restfulwebservice.service;

import com.gyu.restfulwebservice.error.NotFoundException;
import com.gyu.restfulwebservice.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDaoService {
    private static List<User> users = new ArrayList<>();

    public static int userCount = 3;

    static {
        users.add(new User(1L, "Kenneth"));
        users.add(new User(2L, "Alice"));
        users.add(new User(3L, "Elena"));
    }

    public List<User> findAll() {
        return users;
    }

    public User save(User user) {
        users.add(user);
        return user;
    }

    public User findOne(long id) {
        for(User user : users) {
            if(user.getId() == id) {
                return user;
            }
        }
        throw new NotFoundException(User.class, id);
    }
}
