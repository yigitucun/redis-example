package com.ali.redis.example.api.controllers;

import com.ali.redis.example.business.abstracts.CityService;
import com.ali.redis.example.dto.requests.AddCityRequest;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cities")
@AllArgsConstructor
public class CityController {

    private CityService cityService;

    @PostMapping
    public ResponseEntity<?> add(@RequestBody AddCityRequest request){
        return new ResponseEntity<>(this.cityService.add(request), HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<?> getAllCities(){
        return ResponseEntity.ok(this.cityService.getAllCities());
    }

}
