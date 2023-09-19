package com.ssafy.rentservice.repository;

import com.ssafy.rentservice.model.Seat;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SeatRepository extends MongoRepository<Seat, String> {
}
