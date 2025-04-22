package org.bamsy.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@Document(collection = "bid")
public class Bid {
    @Id
    private String auctionId;
    @DBRef
    private User bidder;
    @DBRef
    private Auction auction;
    private double amount;
    private LocalDate date;
}
