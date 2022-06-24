package com.processpension.service;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;

import com.processpension.entity.PensionDetail;
import com.processpension.repository.PensionDetailsRepo;

@Service
public class ProcessPensionServiceImpl implements ProcessPensionService {
	 
	@Autowired
	public PensionDetailsRepo pensionDetailsRepo;
	
	
	PensionDetail pensionDetail = new PensionDetail();
	
	@Override
	public PensionDetail getPensionDetail(String adhaarNumber) {
		double pensionAmount = 0;
		if (pensionDetail.getPensionType().equalsIgnoreCase("self")) {
			pensionAmount = (0.8*pensionDetail.getSalary() + pensionDetail.getAllowance());
		} else if (pensionDetail.getPensionType().equalsIgnoreCase("family")) {
			pensionAmount = (0.5 * pensionDetail.getSalary() + pensionDetail.getAllowance());
		}
		if (pensionDetail.getBankType().equalsIgnoreCase("private")) {
			pensionAmount = pensionAmount - 550;
		}
		else if (pensionDetail.getBankType().equalsIgnoreCase("public")) {
			pensionAmount = pensionAmount - 500;
		}
		return pensionDetail;
	}

	@Override
	public String savePensionDetail(PensionDetail pensionDetail) {
		PensionDetail savedPensionDetail = pensionDetailsRepo.save(pensionDetail);
		return savedPensionDetail.getAdhaarNumber();
	}




}
