package org.bamsy.repositories;

import org.bamsy.models.Bid;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BidRepository extends MongoRepository<Bid, String> {

}
