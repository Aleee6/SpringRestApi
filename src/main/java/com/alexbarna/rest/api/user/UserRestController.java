package com.alexbarna.rest.api.user;

import com.alexbarna.rest.exception.UserNotFoundException;
import com.alexbarna.rest.service.jwt.JwtTokenService;
import com.alexbarna.rest.service.user.UserDto;
import com.alexbarna.rest.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

@RestController
public class UserRestController {
    private final UserService userService;

    @Autowired
    public UserRestController(final UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public UserDto getCurrentUser(HttpServletRequest request){
        return userService.getCurrentUser(request);
    }

    @PostMapping("/user")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public UserDto createUser(@RequestBody UserRequest request){
        return userService.createFromRequest(request);
    }

    @GetMapping("/user/{id}")
    public UserDto getUser(@PathVariable Long id){
        return userService.getById(id);
    }

    @DeleteMapping("/user/{id}")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public ResponseEntity deleteUser(@PathVariable Long id){
        userService.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
