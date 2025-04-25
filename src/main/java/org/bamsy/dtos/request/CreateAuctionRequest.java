package org.bamsy.dtos.request;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


@Setter
@Getter
public class CreateAuctionRequest {
    private String itemName;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;

}
