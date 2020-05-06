package com.alexbarna.rest.api.auth;

import com.alexbarna.rest.service.jwt.JwtTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationRestController {
    private final JwtTokenService service;
    private final AuthenticationManager authenticationManager;

    @Autowired
    public AuthenticationRestController(final JwtTokenService service, AuthenticationManager authenticationManager) {
        this.service = service;
        this.authenticationManager = authenticationManager;
    }

    @PostMapping("/authentication")
    public ResponseEntity<JwtResponse> authenticate(@RequestBody AuthenticationRequest authenticationRequest){
        authenticate(authenticationRequest.getUsername(), authenticationRequest.getPassword());
        return ResponseEntity.ok(new JwtResponse(service.getToken(authenticationRequest)));
    }
    private void authenticate(String username, String password) {
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
    }
}
