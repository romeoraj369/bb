package com.happy.bloodbank.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.happy.bloodbank.entity.BloodDetails;
@Repository
public interface BloodRepo extends JpaRepository<BloodDetails, Integer>{

}