package org.bamsy.services;

import org.bamsy.dtos.request.CreateAuctionRequest;
import org.bamsy.dtos.response.AuctionResponse;
import org.bamsy.models.Auction;
import org.bamsy.repositories.AuctionRepository;
import org.bamsy.repositories.BidRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class AuctionService {
    private final AuctionRepository auctionRepository;
    private final BidRepository bidRepository;

    public AuctionService(AuctionRepository auctionRepository, BidRepository bidRepository) {
        this.auctionRepository = auctionRepository;
        this.bidRepository = bidRepository;
    }

    public AuctionResponse createAuction(CreateAuctionRequest req) {
        if (req.getStartDate().isBefore(req.getEndDate())) {
            throw new IllegalArgumentException("End time must be after start time");
        }

        Auction auction = new Auction();
        auction.setItemName(req.getItemName());
        auction.setItemDescription(req.getDescription());
        auction.setItemStartingDate(req.getStartDate());
        auction.setItemEndingDate(req.getEndDate());
        auction.setItemStartingPrice(100_000);
        auction.setItemStatus("UPCOMING");
        auctionRepository.save(auction);
    }
    int
}