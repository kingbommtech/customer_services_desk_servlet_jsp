package com.nacre.cust.servicesImpl;

import com.nacre.cust.bo.CustRegistrationBo;
import com.nacre.cust.daoImpl.CustRegitrationDao;
import com.nacre.cust.dto.CustRegistrationDto;


public class CustRegistrationService {
	int res=0;
	CustRegistrationBo custregBo=new CustRegistrationBo();
	CustRegitrationDao custregDao=new CustRegitrationDao();
	public boolean register(CustRegistrationDto custregDto){
        //RegistrationBo set value 
   	    custregBo.setFname(custregDto.getFname());
   	    custregBo.setPhone(custregDto.getPhone());
   	    custregBo.setEmail(custregDto.getEmail());
   	    custregBo.setPhoto(custregDto.getPhoto());
   	    custregBo.setDob(custregDto.getDob());
   	    custregBo.setAddr(custregDto.getAddr());
   	    custregBo.setUname(custregDto.getUname());
        custregBo.setPass(custregDto.getPass());
        custregBo.setFile(custregDto.getFile());
        
        res=custregDao.insert(custregBo);
   	    if(res==1)
   	         return true;
   	    else 
   		     return false;
	}
	
}
