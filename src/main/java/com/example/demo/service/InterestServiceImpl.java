package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.InterestRate;
import com.example.demo.repository.InterestAppReppository;

@Service
public class InterestServiceImpl implements InterestService{

	
	@Autowired 
	private InterestAppReppository interestRepository;
	@Override
	public List<InterestRate> getAll() {

		return interestRepository.findAll();
	}
	
	
	@Override
	public InterestRate saveInterest(InterestRate interestRate) {
		
			return interestRepository.save(interestRate);
		
	}
	
	@Override
	public InterestRate updateInterest(InterestRate rate) {
		return interestRepository.update(rate);
	}


	@Override
	public String deleteInterest(int id) {
		
		return interestRepository.delete(id);
	}
}
