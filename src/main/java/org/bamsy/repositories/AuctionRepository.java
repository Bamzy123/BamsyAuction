package org.bamsy.repositories;

import org.bamsy.models.Auction;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.LocalDate;
import java.util.List;

public interface AuctionRepository extends MongoRepository<Auction, String> {
    List<Auction> findByItemStartingDateAndItemEndingDate(LocalDate itemStartingDate, LocalDate itemEndingDate);
}