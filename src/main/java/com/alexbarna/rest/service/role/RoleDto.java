package com.alexbarna.rest.service.role;

import com.alexbarna.rest.service.user.UserDto;

public class RoleDto {
    private Long id;
    private UserDto user;
    private String roles;

    public RoleDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }
}
