package com.example.uberbookingservice.services;


import com.example.uberbookingservice.dto.CreateBookingDto;
import com.example.uberbookingservice.dto.CreateBookingResponseDto;
import com.example.uberbookingservice.dto.UpdateBookingRequestDto;
import com.example.uberbookingservice.dto.UpdateBookingResponseDto;
import com.example.uberprojectentityservice.models.Booking;

public interface BookingService {

    CreateBookingResponseDto createBooking(CreateBookingDto bookingDetails);

    UpdateBookingResponseDto updateBooking(UpdateBookingRequestDto bookingRequestDto, Long bookingId);
}
