package org.bamsy.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@Document(collection = "auction")
public class Auction {
    @Id
    private String itemId;
    private String itemName;
    private String itemDescription;
    private double itemStartingPrice;
    private LocalDate itemStartingDate;
    private LocalDate itemEndingDate;
    private String itemStatus;
}
