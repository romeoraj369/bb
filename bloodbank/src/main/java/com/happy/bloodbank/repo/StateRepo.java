package com.happy.bloodbank.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.happy.bloodbank.entity.State;

@Repository
public interface StateRepo extends JpaRepository<State, Integer>{

}