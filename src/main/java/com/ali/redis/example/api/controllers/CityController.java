package com.ali.redis.example.api.controllers;

import com.ali.redis.example.business.abstracts.CityService;
import com.ali.redis.example.dto.requests.AddCityRequest;
import com.ali.redis.example.dto.requests.UpdateCityRequest;
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
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteCity(@PathVariable int id){
        this.cityService.deleteCity(id);
        return new ResponseEntity<>("Başarıyla silindi.",HttpStatus.OK);
    }
    @PutMapping
    public ResponseEntity<?> updateCity(@RequestBody UpdateCityRequest request){
        return new ResponseEntity<>(this.cityService.updateCity(request),HttpStatus.OK);
    }

}
