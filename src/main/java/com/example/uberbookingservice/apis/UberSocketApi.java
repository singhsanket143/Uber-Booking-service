package com.example.uberbookingservice.apis;

import com.example.uberbookingservice.dto.RideRequestDto;
import org.springframework.http.ResponseEntity;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface UberSocketApi {

    @POST("api/socket/newride")
    Call<Boolean> raiseRideRequest(@Body RideRequestDto requestDto);
}
