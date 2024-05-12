package com.example.uberbookingservice.repositories;

import com.example.uberprojectentityservice.models.Booking;
import com.example.uberprojectentityservice.models.BookingStatus;
import com.example.uberprojectentityservice.models.Driver;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BookingRepository extends JpaRepository<Booking, Long> {


    @Modifying
    @Transactional
    @Query("UPDATE Booking b SET b.bookingStatus = :status , b.driver = :driver  WHERE b.id = :id ")
    void updateBookingStatusAndDriverById(@Param("id") Long id, @Param("status") BookingStatus status, @Param("driver") Driver driver);

}
