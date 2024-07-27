package com.codecademy.goldmedal.repositories;

import com.codecademy.goldmedal.model.Country;
import com.codecademy.goldmedal.model.GoldMedal;
import com.codecademy.goldmedal.model.Medals;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MedalsRepository extends CrudRepository<GoldMedal, Integer> {
    List<GoldMedal> findByCountryNameOrderByYearAsc(String countryName);
    List<GoldMedal> findByCountryNameOrderBySeasonAsc(String countryName);
    List<GoldMedal> findByCountryNameOrderByCityAsc(String countryName);
    List<GoldMedal> findByCountryNameOrderByNameAsc(String countryName);
    List<GoldMedal> findByCountryNameOrderByEventAsc(String countryName);
    int countByCountry(String country);
    int countBySeason(String season);
    List<GoldMedal> findByCountryAndSeasonOrderByYearAsc(String countryName, String season);
    List<GoldMedal> findBySeason(String season);
    int countBySeasonOrderByYearAsc(String season);
    int countByGender(String gender);
}
