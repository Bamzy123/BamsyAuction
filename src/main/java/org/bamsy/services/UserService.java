package org.bamsy.services;

import org.bamsy.dtos.request.LoginRequest;
import org.bamsy.dtos.request.RegisterRequest;
import org.bamsy.dtos.response.LoginResponse;
import org.bamsy.dtos.response.RegisterResponse;
import org.bamsy.models.RegularUser;
import org.bamsy.models.User;
import org.bamsy.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepo;

    public UserService(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    public RegisterResponse register(RegisterRequest req) {
        if (userRepo.findByUserName(req.getUserName()).isPresent())
            throw new IllegalArgumentException("Taken");
        User user = new RegularUser("1", "stephen", "1234", "admin");         // or new Admin() if role=="ADMIN"
        user.setUserName(req.getUserName());
        user.setPassword(req.getPassword());
        user.setRole(req.getRole());
        user = userRepo.save(user);
        return new RegisterResponse(user.getUserId(), user.getUserName(), user.getRole());
    }

    public LoginResponse login(LoginRequest req) {
        User u = userRepo.findByUserName(req.getUserName())
                .filter(user -> user.getPassword().equals(req.getPassword()))
                .orElseThrow(() -> new IllegalArgumentException("Bad credentials"));
        return new LoginResponse(u.getUserId(), u.getRole());
    }
}

