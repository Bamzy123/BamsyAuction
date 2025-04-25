package org.bamsy.dtos.request;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


@Getter
public class CreateAuctionRequest {
    private String itemName;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
