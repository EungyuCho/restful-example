package com.gyu.restfulwebservice.model;

import java.time.LocalDateTime;

import static com.google.common.base.Preconditions.checkArgument;
import static org.apache.commons.lang3.StringUtils.isNotEmpty;
import static org.apache.commons.lang3.ObjectUtils.defaultIfNull;
import static java.time.LocalDateTime.now;

public class User {

    private Long id;
    private String name;
    private LocalDateTime joinDate;

    public User(Long id, String name) {
        this(id, name, null);
    }

    public User(Long id, String name, LocalDateTime joinDate) {
        checkArgument(isNotEmpty(name),"name must be provided.");
        this.id = id;
        this.name = name;
        this.joinDate = defaultIfNull(joinDate, now());
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getJoinDate() {
        return joinDate;
    }

}
