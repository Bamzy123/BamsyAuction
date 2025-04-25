package org.bamsy.dtos.response;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class BidResponse {
    private String auctionId;
    private String bidderId;
    private String bidder;
    private Double amount;
    private LocalDate date;
}
