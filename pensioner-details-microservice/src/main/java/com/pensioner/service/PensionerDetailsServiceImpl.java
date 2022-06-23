package com.pensioner.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.stereotype.Service;

//import java.util.List;

import com.pensioner.entity.PensionerDetail;

@Service
public class PensionerDetailsServiceImpl implements PensionerDetailsService{
	
	//  data of PensionerDetail
	
/*	List<PensionerDetail> list = List.of(
			new PensionerDetail("123456789012","Iftak","29-01-1999","PCASD1234Q",27000,10000,"self","ICICI",12345678L,"private"),
			new PensionerDetail	("123456789013","Pratyush","27-11-1998","PCQAZ1285Q",30000,12000,"family","SBI",12345679L,"public"),
			new PensionerDetail	("123456789014","Sanyam","24-10-1998","PCERF1212E",30001,12001,"self","HDFC",12345680L,"private"),
			new PensionerDetail	("123456789015","Surya","02-07-1997","PCSDZ1287G",40000,12002,"family","SBI",12345681L,"public"),
			new PensionerDetail	("123456789016","Virat","12-09-1956","GHFKJ67894",78000,9000,"family","ICIC",12345682L,"private"),
			new PensionerDetail	("123456789017","Sachin","14-12-1989","HJFOK89062",90000,5000,"family","KOTAK",12345683L,"private"),
			new PensionerDetail	("123456789018","John","18-09-1976","MKUIO12345",100000,9000,"self","centralbank",12345684L,"public"),
			new PensionerDetail	("123456789019","Rahul","24-12-1995","TYUOI09874",98000,5500,"self","HSBC",12345685L,"private"),
			new PensionerDetail	("123456789020","Zahir","21-09-1993","POULV05643",50000,1000,"family","City",12345686L,"private"),
			new PensionerDetail	("123456789021","Pranav","07-03-1990","TGDOP09872",70000,2000,"self","Statebank",12345687L,"public"),
			new PensionerDetail	("123456789022","Rajesh","11-09-1998","BHMER12436",50000,4000,"self","HDFC",12345688L,"private"),
			new PensionerDetail	("123456789023","Umesh","12-02-1997","HMPIO67182",68000,5000,"family","IOB",12345689L,"public"),
			new PensionerDetail	("123456789024","Satyam","01-01-1998","SHTOC34253",65000,8000,"self","IndianBank",12345690L,"public"),
			new PensionerDetail	("123456789025","Saket","14-02-1998","DFGYM14759",55000,2000,"self","HDFC",12345691L,"private"),
			new PensionerDetail	("123456789026","Aakash","12-09-1956","GHFFM67983",78000,9000,"family","ICIC",12345692L,"private"),
			new PensionerDetail	("123456789027","Embid","14-12-1989","HJAVK89604",90000,5000,"family","KOTAK",12345693L,"private"),
			new PensionerDetail	("123456789028","Prateek","18-09-1976","MKUYD12432",100000,9000,"self","centralbank",12345694L,"public"),
			new PensionerDetail	("123456789029","Preet","24-12-1995","TYIUI09782",98000,5500,"self","HSBC",12345695L,"private"),
			new PensionerDetail	("123456789030","Neha","21-09-1993","POUTR05461",50000,1000,"family","City",12345696L,"private"),
			new PensionerDetail	("123456789031","Sriram","07-03-1990","TGDUY09782",70000,2000,"self","Statebank",12345697L,"public")
				
				);
	public PensionerDetail getPensionerDetailByAadhaarNumber(String aadhaarNumber) {
		
		return (PensionerDetail) this.list.stream().filter(pensionerDetail -> pensionerDetail.getAdhaarNumber().equals(aadhaarNumber).findAny().orElse(null));
	}
	*/
	
	

	@Override
	public PensionerDetail getPensionerDetailByAadhaarNumber(String adhaarNumber) throws NumberFormatException, IOException  {
		
		BufferedReader buffer = null;
		try {
			buffer = new BufferedReader(new FileReader("src/main/resources/details.csv"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String line = "";
		PensionerDetail pensionerDetail = new PensionerDetail();
		while ((line = buffer.readLine()) !=null) {
			String[] data = line.split(",");
			System.out.println("Input the aadhar number" + adhaarNumber);
			System.out.println("Input aadhar number" + data[0]);
			if(adhaarNumber.equalsIgnoreCase(data[0]))
			{
				pensionerDetail.setAdhaarNumber(data[0]);
				pensionerDetail.setName(data[1]);
				pensionerDetail.setDateOfBirth(data[2]);
				pensionerDetail.setPan(data[3]);
				pensionerDetail.setSalary(Double.parseDouble(data[4]));
				pensionerDetail.setAllowance(Double.parseDouble(data[5]));
				pensionerDetail.setPensionType(data[6]);
				pensionerDetail.setBankName(data[7]);
				pensionerDetail.setAccountNumber(data[8]);
				pensionerDetail.setBankType(data[9]);
			}
		}
		
		
	
		return pensionerDetail;
	}

}
