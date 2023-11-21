package com.ali.redis.example.dto.responses;

import com.ali.redis.example.entities.concretes.City;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ListCitiesResponse {

    private int id;
    private String city;
    private int plateCode;
    public static List<ListCitiesResponse> getAll(List<City> cities){
        List<ListCitiesResponse> responses = new ArrayList<>();
        for (City city:cities){
            ListCitiesResponse response = new ListCitiesResponse();
            response.setId(city.getId());
            response.setCity(city.getCity());
            response.setPlateCode(city.getPlateCode());
            responses.add(response);
        }
        return responses;
    }

}
