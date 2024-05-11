package com.example.uberbookingservice.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NearbyDriversRequestDto {
    Double latitude;
    Double longitude;
}
