package org.bamsy.services;

import org.bamsy.models.Auction;
import org.bamsy.models.User;
import org.bamsy.repositories.AuctionRepository;
import org.bamsy.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    private final UserRepository userRepository;
    private final AuctionRepository auctionRepository;

    public AdminService(UserRepository userRepository, AuctionRepository auctionRepository) {
        this.userRepository = userRepository;
        this.auctionRepository = auctionRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public List<Auction> getAllAuctions() {
        return auctionRepository.findAll();
    }

    public void deleteAuction(String auctionId) {
        if (!auctionRepository.existsById(auctionId)) {
            throw new IllegalArgumentException("Auction not found");
        }
        auctionRepository.deleteById(auctionId);
    }
}
