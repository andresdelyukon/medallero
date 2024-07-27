package com.codecademy.goldmedal.repositories;


import com.codecademy.goldmedal.model.Country;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CountryRepositories extends CrudRepository<Country, Integer> {
    Optional<Country> findByName(String name);
    List<Country> getAllByOrderByNameAsc();
    List<Country> getAllByOrderByGdpAsc();
    List<Country> getAllByOrderByPopulationAsc();

}
