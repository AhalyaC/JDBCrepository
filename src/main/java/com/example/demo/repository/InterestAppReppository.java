package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.InterestRate;

@Repository
public class InterestAppReppository {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<InterestRate> findAll(){
		List<InterestRate> listRate = new ArrayList<>();
		String sql = "select * from interestrate";
		listRate=jdbcTemplate.query(sql, new BeanPropertyRowMapper(InterestRate.class)); 
		return listRate;
	}

	public InterestRate save(InterestRate interestRate) {
		String sql ="insert into interestrate(interest_id,rate_specification_code,name,description,currency,valid_from,valid_till) values (?,?,?,?,?,?,?)";
		int rate = jdbcTemplate.update(sql,interestRate.getInterestId(), interestRate.getCurrency(),interestRate.getDescription(),interestRate.getName(),
				interestRate.getRateSpecificationCode(),interestRate.getValidFrom(),interestRate.getValidTill());
				System.out.println(rate);
		return interestRate;
	}
}
