package org.bamsy.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
public class AuctionResponse {
    private String itemId;
    private String itemName;
    private String itemDescription;
    private double itemStartingPrice;
    private LocalDate itemStartingDate;
    private LocalDate itemEndingDate;
    private String itemStatus;
}
