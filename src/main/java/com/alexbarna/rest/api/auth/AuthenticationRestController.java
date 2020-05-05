package com.alexbarna.rest.api.auth;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationRestController {

    @PostMapping("/authentication")
    public String authenticate(){
        return "";
    }
}
