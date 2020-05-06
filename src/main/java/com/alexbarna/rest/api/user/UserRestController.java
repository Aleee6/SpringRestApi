package com.alexbarna.rest.api.user;

import com.alexbarna.rest.service.user.UserDto;
import com.alexbarna.rest.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserRestController {
    private final UserService service;

    @Autowired
    public UserRestController(final UserService service) {
        this.service = service;
    }

    @GetMapping("/user")
    public UserDto getCurrentUser(){
        return service.getCurrentUser();
    }

    @PostMapping("/user")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public UserDto createUser(UserDto request){
        return service.createFromRequest(request);
    }

    @GetMapping("/user/{id}")
    public UserDto getUser(@PathVariable Long id){
        return service.getById(id);
    }

    @DeleteMapping("/user/{id}")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String deleteUser(@PathVariable Long id){
        service.deleteById(id);
        return "";
    }
}
