package com.ali.redis.example.dto.requests;

import com.ali.redis.example.entities.concretes.City;
import lombok.Data;

import java.io.Serializable;

@Data
public class UpdateCityRequest implements Serializable {

    private int id;
    private String city;
    private int plateCode;
    public City toEntity(UpdateCityRequest request){
        return City.builder()
                .id(request.getId())
                .plateCode(request.getPlateCode())
                .city(request.getCity())
                .build();
    }

}
