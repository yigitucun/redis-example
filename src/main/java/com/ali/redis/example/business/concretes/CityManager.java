package com.ali.redis.example.business.concretes;

import com.ali.redis.example.business.abstracts.CityService;
import com.ali.redis.example.business.rules.CityBusinessRules;
import com.ali.redis.example.dataAccess.abstracts.ICityRepository;
import com.ali.redis.example.dto.requests.AddCityRequest;
import com.ali.redis.example.dto.responses.ListCitiesResponse;
import com.ali.redis.example.entities.concretes.City;
import lombok.AllArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CityManager implements CityService {

    private final ICityRepository cityRepository;
    private final CityBusinessRules cityBusinessRules;
    @Override
    @CacheEvict(value = "cities",allEntries = true)
    public AddCityRequest add(AddCityRequest request) {
        this.cityBusinessRules.checkIfCityCity(request.getCity());
        this.cityBusinessRules.checkIfCityPlateCode(request.getPlateCode());
        this.cityRepository.save(request.toEntity(request));
        return request;
    }
    @Override
    @Cacheable(value = "cities")
    public List<ListCitiesResponse> getAllCities() {
        List<City> cities = this.cityRepository.findAll();
        return ListCitiesResponse.getAll(cities);
    }
    @Override
    @CacheEvict(value = "cities",key = "#id",allEntries = true)
    public void deleteCity(int id) {
        this.cityBusinessRules.checkIfCityId(id);
        this.cityRepository.deleteById(id);
    }
}
