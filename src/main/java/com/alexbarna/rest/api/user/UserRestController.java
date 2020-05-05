package com.alexbarna.rest.api.user;

import com.alexbarna.rest.service.CrudService;
import com.alexbarna.rest.service.user.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserRestController {
    private final CrudService<UserDto, UserRequest> service;

    @Autowired
    public UserRestController(final CrudService<UserDto, UserRequest> service) {
        this.service = service;
    }


    @GetMapping("/user/{id}")
    public UserDto getUser(@PathVariable Long id){
        return service.getById(id);
    }

    @PostMapping
    public UserDto createUser(UserRequest request){
        return service.createFromRequest(request);
    }

    @DeleteMapping("/user/{id}")
    public UserDto deleteUser(@PathVariable Long id){
        return service.deleteById(id);
    }
}
