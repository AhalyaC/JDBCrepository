package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.InterestRate;


public interface InterestService {

	List<InterestRate> getAll();

	InterestRate saveInterest(InterestRate interestRate);
}
