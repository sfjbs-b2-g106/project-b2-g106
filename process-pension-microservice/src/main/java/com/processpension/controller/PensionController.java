package com.processpension.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.processpension.entity.PensionDetail;
import com.processpension.service.ProcessPensionService;


@RestController
public class PensionController {
	
	@Autowired
	private ProcessPensionService processPensionService;
	
	@PostMapping("/processPensionInput")
	String createPensioner(@RequestBody PensionDetail pensionDetail) {
		
		String adhaarNumber = processPensionService.savePensionDetail(pensionDetail);
		return adhaarNumber;
	}

	


	@GetMapping("/processPensionInput/{adhaarNumber}")
	public PensionDetail getPensionDetail(@PathVariable String adhaarNumber)  {
		String pensionDetail = null;
		return processPensionService.getPensionDetail(pensionDetail);
	}
		
	

}