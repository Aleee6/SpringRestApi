package com.alexbarna.rest.api.auth;

import com.alexbarna.rest.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationRestController {
    private final UserService service;

    @Autowired
    public AuthenticationRestController(final UserService service) {
        this.service = service;
    }

    @PostMapping("/authentication")
    public String authenticate(){
        return "";
    }
}
