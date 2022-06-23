package com.pensioner.service;




import java.io.IOException;


import com.pensioner.entity.PensionerDetail;

public interface PensionerDetailsService{
	
	public PensionerDetail getPensionerDetailByAadhaarNumber(String adhaarNumber) throws NumberFormatException, IOException;
	
	//public PensionerDetail getPensionerDetailByAadhaarNumber(String adhaarNumbe);

}
