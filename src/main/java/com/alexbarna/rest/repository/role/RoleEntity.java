package com.alexbarna.rest.repository.role;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "user_roles")
public class RoleEntity {
    private Long userId;
    private String role;

    public RoleEntity() {
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
