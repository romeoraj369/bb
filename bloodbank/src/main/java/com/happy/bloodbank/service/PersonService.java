package com.happy.bloodbank.service;

import java.util.List;

import com.happy.bloodbank.entity.PersonDetails;

public interface PersonService {
public List<PersonDetails> getall();
public PersonDetails save(PersonDetails pd);
}