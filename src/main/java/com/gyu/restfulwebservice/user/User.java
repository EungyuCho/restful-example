package com.gyu.restfulwebservice.user;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

import static com.google.common.base.Preconditions.checkArgument;
import static org.apache.commons.lang3.StringUtils.isNotEmpty;
import static org.apache.commons.lang3.ObjectUtils.defaultIfNull;
import static java.time.LocalDateTime.now;

public class User {

    private Long userCount = 1L;

    private Long id;
    private String name;
    private LocalDateTime joinDate;

    public User(String name) {
        this(null, name, null);
    }

    public User(Long id, String name, LocalDateTime joinDate) {
        checkArgument(isNotEmpty(name),"name must be provided.");
        this.id = userCount++;
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
