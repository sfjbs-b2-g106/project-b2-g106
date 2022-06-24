package com.processpension.service;



import com.processpension.entity.PensionDetail;


public interface ProcessPensionService {

	public String savePensionDetail(PensionDetail pensionDetail);
	
	public PensionDetail getPensionDetail(String adhaarNumber);

	

	
	

	
	
}
