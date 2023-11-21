package com.ali.redis.example.dto.requests;

import com.ali.redis.example.entities.concretes.City;
import lombok.Data;

@Data
public class UpdateCityRequest {
    
    private int id;
    private String city;
    private int plateCode;
    public City toEntity(UpdateCityRequest request){
        return City.builder()
                .plateCode(request.getPlateCode())
                .city(request.getCity())
                .build();
    }

}
