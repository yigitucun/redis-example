package com.ali.redis.example.business.concretes;

import com.ali.redis.example.business.abstracts.CityService;
import com.ali.redis.example.dataAccess.abstracts.ICityRepository;
import com.ali.redis.example.dto.requests.AddCityRequest;
import com.ali.redis.example.dto.responses.ListCitiesResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CityManager implements CityService {

    private final ICityRepository cityRepository;
    private final C
    @Override
    public AddCityRequest add(AddCityRequest request) {
        return null;
    }

    @Override
    public List<ListCitiesResponse> getAllCities() {
        return null;
    }
}
