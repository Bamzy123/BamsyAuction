package org.bamsy.controllers;

import org.bamsy.exceptions.AccessDeniedException;
import org.bamsy.models.Auction;
import org.bamsy.models.User;
import org.bamsy.repositories.UserRepository;
import org.bamsy.services.AdminService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    private final AdminService adminService;
    private final UserRepository userRepository;

    public AdminController(AdminService adminService, UserRepository userRepository) {
        this.adminService = adminService;
        this.userRepository = userRepository;
    }

    private void checkAdminAccess(String admin) {
        User user = (User) userRepository.findByRole(admin);
        if (!user.isAdmin()) throw new AccessDeniedException("Access denied: Admins only");
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUsers(@RequestHeader("userId") String userId) {
        checkAdminAccess(userId);
        return ResponseEntity.ok(adminService.getAllUsers());
    }

    @GetMapping("/auctions")
    public ResponseEntity<List<Auction>> getAllAuctions(@RequestHeader("userId") String userId) {
        checkAdminAccess(userId);
        return ResponseEntity.ok(adminService.getAllAuctions());
    }

    @DeleteMapping("/auctions/{id}")
    public ResponseEntity<String> deleteAuction(@RequestHeader("userId") String userId, @PathVariable String id) {
        checkAdminAccess(userId);
        adminService.deleteAuction(id);
        return ResponseEntity.ok("Auction deleted successfully");
    }
}