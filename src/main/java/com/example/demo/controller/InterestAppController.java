package com.example.demo.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.InterestRateDto;
import com.example.demo.entity.InterestRate;
import com.example.demo.service.InterestService;



@RestController
@RequestMapping("/interestrate")
public class InterestAppController {

	@Autowired
	private InterestService service;

	@Autowired
	private ModelMapper modelMapper;



	@PostMapping("/save-interest")
	public ResponseEntity<InterestRateDto>createIntrestApp1(@RequestBody InterestRateDto interestRateDTO){
		InterestRate interestRate = modelMapper.map(interestRateDTO, InterestRate.class);
		InterestRate intrestApp11 = service.saveInterest(interestRate);
		InterestRateDto intrestApprequest1 = modelMapper.map(interestRate, InterestRateDto.class);
		return new ResponseEntity<InterestRateDto>(intrestApprequest1, HttpStatus.CREATED);
	}
	@GetMapping("/get-all")
	public List<InterestRate> getAllRate(){
		return service.getAll();
	}
}
