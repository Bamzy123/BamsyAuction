package org.bamsy.controllers;

import org.bamsy.dtos.request.LoginRequest;
import org.bamsy.dtos.request.RegisterRequest;
import org.bamsy.dtos.response.LoginResponse;
import org.bamsy.dtos.response.RegisterResponse;
import org.bamsy.services.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public RegisterResponse register(@RequestBody RegisterRequest req) {
        return userService.register(req);
    }

    @PostMapping("/Login")
    public LoginResponse login(@RequestBody LoginRequest req) {
        return userService.login(req);
    }
}
