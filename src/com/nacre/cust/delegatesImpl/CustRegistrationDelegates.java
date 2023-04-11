package com.nacre.cust.delegatesImpl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.nacre.cust.dto.CustRegistrationDto;
import com.nacre.cust.servicesImpl.CustRegistrationService;
import com.nacre.cust.vo.CustRegistrationVo;

public class CustRegistrationDelegates {
	
	public boolean pars(CustRegistrationVo custregVo){
		//local variable
		long phone=0;
		Date dob=null;
		FileInputStream fs=null;
		CustRegistrationDto custregDto=null;
		CustRegistrationService custregSer=null;
		
		//parsing logic
		phone=Long.parseLong(custregVo.getPhone());
	    File f=new File(custregVo.getPhoto());
	    	System.out.println(f);
		try {
			 fs = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//ps.setBinarySteam(6,(int)f.length(),fs);
		try {
			SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
			java.util.Date jdate=sdf.parse(custregVo.getDob());
			dob=new Date(jdate.getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		//Creating RegistrationDto object
		custregDto=new CustRegistrationDto();
		custregDto.setFname(custregVo.getFname());
		custregDto.setPhone(phone);
		custregDto.setEmail(custregVo.getEmail());
		custregDto.setPhoto(fs);
		custregDto.setDob(dob);
		custregDto.setAddr(custregVo.getAddr());
		custregDto.setUname(custregVo.getUname());
		custregDto.setPass(custregVo.getPass());
		custregDto.setFile(f);
		//Creating RegistrationService object
		custregSer =new CustRegistrationService();
		
		return custregSer.register(custregDto);
	}

}
