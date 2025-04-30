package org.bamsy.repositories;

import org.bamsy.models.Bid;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface BidRepository extends MongoRepository<Bid, String> {
    Optional<Bid> findById(String id);
}
