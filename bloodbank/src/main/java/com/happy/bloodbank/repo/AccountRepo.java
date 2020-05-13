package com.happy.bloodbank.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.happy.bloodbank.entity.AccountDetails;
@Repository
public interface AccountRepo extends JpaRepository<AccountDetails, Integer>{

}