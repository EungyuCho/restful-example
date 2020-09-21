package com.gyu.restfulwebservice.user;

import com.gyu.restfulwebservice.error.NotFoundException;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserDaoService {
    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User( "Kenneth"));
        users.add(new User( "Alice"));
        users.add(new User("Elena"));
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
