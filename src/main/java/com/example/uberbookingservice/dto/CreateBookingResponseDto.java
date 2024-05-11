package com.example.uberbookingservice.dto;

import com.example.uberprojectentityservice.models.Driver;
import lombok.*;

import java.util.Optional;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateBookingResponseDto {
    private long bookingId;
    private String bookingStatus;
    private Optional<Driver> driver;

}
