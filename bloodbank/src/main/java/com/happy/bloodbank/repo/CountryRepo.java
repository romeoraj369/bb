package com.happy.bloodbank.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.happy.bloodbank.entity.Country;

@Repository
public interface CountryRepo extends JpaRepository<Country, Integer>{

}