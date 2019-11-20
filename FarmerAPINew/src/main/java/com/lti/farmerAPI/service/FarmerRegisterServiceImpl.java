package com.lti.farmerAPI.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.farmerAPI.entity.FarmerRegister;
import com.lti.farmerAPI.repository.FarmerRegisterRepository;

@Service
@Transactional
public class FarmerRegisterServiceImpl implements FarmerRegisterService{
	
	// Implementing Constructor based DI
			private FarmerRegisterRepository farmerRegisterRepository;
			
			public FarmerRegisterServiceImpl() {
				
			}
			
			@Autowired
			public FarmerRegisterServiceImpl(FarmerRegisterRepository farmerRegisterRepository) {
				super();
				this.farmerRegisterRepository = farmerRegisterRepository;
			}
			
		/*@Override
		public List<Author> getAllUsers() {
			List<Author> list = new ArrayList<Author>();
			repository.findAll().forEach(e -> list.add(e));
			return list;
		}

		@Override
		public Author getUserById(Long id) {
			Author user = repository.findById(id).get();
			return user;
		}*/

			
			
			public boolean saveFarmerRegister(FarmerRegister farmerRegister) {
			try {
				farmerRegisterRepository.save(farmerRegister);
				return true;
			}catch(Exception ex) {
				return false;
			}
		}

		/*@Override
		public boolean deleteUserById(Long id) {
			try {
				repository.deleteById(id);
				return true;
			}catch(Exception ex) {
				return false;
			}
			
		}*/

	}


