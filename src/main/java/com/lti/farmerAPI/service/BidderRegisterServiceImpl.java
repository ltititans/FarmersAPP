package com.lti.farmerAPI.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.lti.farmerAPI.entity.BidderRegister;
import com.lti.farmerAPI.repository.BidderRegisterRepository;

@Service
@Transactional
public class BidderRegisterServiceImpl implements  BidderRegisterService{
	// Implementing Constructor based DI
		private BidderRegisterRepository bidderRegisterRepository;
		
		public BidderRegisterServiceImpl() {
			
		}
		
		@Autowired
		public BidderRegisterServiceImpl(BidderRegisterRepository bidderRegisterRepository) {
			super();
			this.bidderRegisterRepository = bidderRegisterRepository;
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

		
		
		@Override
	public boolean saveBidderRegister(BidderRegister bidderRegister) {
		try {
			bidderRegisterRepository.save(bidderRegister);
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
