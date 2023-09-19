package com.ssafy.rentservice.model;

import com.mongodb.lang.Nullable;
import com.ssafy.rentservice.enums.SeatStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Seat {
    @Id
    private String id;

    private int rowNumber;
    private int columnNumber;
    private BigDecimal price;
    private Integer user;
    private SeatStatus status;
}
