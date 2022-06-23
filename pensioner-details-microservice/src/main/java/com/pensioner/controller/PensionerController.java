package com.pensioner.controller;

import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pensioner.entity.PensionerDetail;
//import com.pensioner.repository.PensionerRepo;
import com.pensioner.service.PensionerDetailsService;

@RestController
public class PensionerController {
	
	@Autowired
	 PensionerDetailsService pensionerDetailService;
	
	private String adhaarNumber;
	
	
	
	@GetMapping("/pensionerdetail/{adhaarNumber}")
	public PensionerDetail getPensionerDetailByAadhaarNumber(@PathVariable String adhaarNumber) throws Exception, IOException {
		
		return pensionerDetailService.getPensionerDetailByAadhaarNumber(adhaarNumber);
		
	}

}
