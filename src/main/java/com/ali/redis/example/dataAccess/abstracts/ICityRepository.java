package com.ali.redis.example.dataAccess.abstracts;

import com.ali.redis.example.entities.concretes.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICityRepository extends JpaRepository<City,Integer> {
    boolean existsByPlateCode(int id);
    boolean existsByCity(String city);
    boolean existsById(int id);
}
