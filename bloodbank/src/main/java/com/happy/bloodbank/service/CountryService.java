package com.happy.bloodbank.service;

import java.util.List;

import com.happy.bloodbank.entity.Country;

public interface CountryService {
public List<Country> getall();
public Country save(Country country);
}