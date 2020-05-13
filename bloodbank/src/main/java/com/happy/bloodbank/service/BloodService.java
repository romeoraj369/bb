package com.happy.bloodbank.service;

import java.util.List;

import com.happy.bloodbank.entity.BloodDetails;

public interface BloodService {
public List<BloodDetails> getall();
public BloodDetails save(BloodDetails bg);
}