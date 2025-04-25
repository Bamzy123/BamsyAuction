package org.bamsy.dtos.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlaceBidRequest {
    private String auctionId;
    private String bidder;
    private Double amount;
}
