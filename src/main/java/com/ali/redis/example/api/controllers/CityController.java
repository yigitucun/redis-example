package com.ali.redis.example.api.controllers;

import com.ali.redis.example.business.abstracts.CityService;
import com.ali.redis.example.dto.requests.AddCityRequest;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cities")
@AllArgsConstructor
public class CityController {

    private CityService cityService;

    public ResponseEntity<?> add(@RequestBody AddCityRequest request){
        return new ResponseEntity<>(this.cityService.add(request), HttpStatus.CREATED);
    }
}
