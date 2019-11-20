package com.lti.farmerAPI.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lti.farmerAPI.entity.BidderRegister;



@Repository
public interface BidderRegisterRepository extends 
CrudRepository<BidderRegister,Long>{

}
