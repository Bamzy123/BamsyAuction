package org.bamsy.services;

import org.bamsy.models.Auction;
import org.bamsy.repositories.AuctionRepository;
import org.bamsy.repositories.BidRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class AuctionService {
    private AuctionRepository auctionRepository;
    private BidRepository bidRepository;

    public AuctionService(AuctionRepository auctionRepository, BidRepository bidRepository) {
        this.auctionRepository = auctionRepository;
        this.bidRepository = bidRepository;
    }

    public Auction createAuction(Auction auction) {
        return auctionRepository.save(auction);
    }
}
