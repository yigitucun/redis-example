package com.ali.redis.example.business.abstracts;

import com.ali.redis.example.dto.requests.AddCityRequest;
import com.ali.redis.example.dto.responses.ListCitiesResponse;

import java.util.List;

public interface CityService {
    AddCityRequest add(AddCityRequest request);
    List<ListCitiesResponse> getAllCities();
    void deleteCity(int id);
}
