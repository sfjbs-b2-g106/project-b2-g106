package com.processpension.service;


import com.processpension.entity.PensionDetail;


public interface ProcessPensionService {

	public PensionDetail calulatePensionAmount(PensionDetail pensionDetail);

	public String savePensioner(PensionDetail pensioner);

}
