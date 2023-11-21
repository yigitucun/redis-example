package com.ali.redis.example.dto.requests;

import com.ali.redis.example.entities.concretes.City;
import lombok.Data;

@Data
public class AddCityRequest {

    private String city;
    private int plateCode;
    public City toEntity(AddCityRequest request){
        return City.builder()
                .city(request.getCity())
                .plateCode(request.getPlateCode())
                .build();
    }

}
