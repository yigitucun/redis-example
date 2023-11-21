package com.ali.redis.example.business.rules;

import com.ali.redis.example.dataAccess.abstracts.ICityRepository;
import com.ali.redis.example.exceptions.businessException.BusinessException;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
@Service
@AllArgsConstructor
public class CityBusinessRules {

    private ICityRepository cityRepository;
    public void checkIfCityPlateCode(int id){
        if (this.cityRepository.existsByPlateCode(id)){
            throw new BusinessException("Bu plaka önceden alınmış.", HttpStatus.BAD_REQUEST);
        }
    }
    public void checkIfCityCity(String city){
        if (this.cityRepository.existsByCity(city)){
            throw new BusinessException("Bu şehir önceden alınmış.",HttpStatus.BAD_REQUEST);
        }
    }

}
