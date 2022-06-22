package com.processpension.controller;

import org.springframework.beans.factory.annotation.Autowired;

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
	String createPensioner(@RequestBody PensionDetail pensioner) {
		
		String adhaarNumber = processPensionService.savePensioner(pensioner);
		return adhaarNumber;
	}

	
}
