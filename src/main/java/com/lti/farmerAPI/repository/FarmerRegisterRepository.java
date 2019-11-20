package com.lti.farmerAPI.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lti.farmerAPI.entity.FarmerRegister;

@Repository
public interface FarmerRegisterRepository extends 
CrudRepository<FarmerRegister,Long>{

}
