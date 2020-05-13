package com.happy.bloodbank.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.happy.bloodbank.entity.RequestTable;

@Repository
public interface RequestRepo extends JpaRepository<RequestTable, Integer>{

}
