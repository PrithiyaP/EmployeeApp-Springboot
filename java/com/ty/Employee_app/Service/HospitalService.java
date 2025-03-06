package com.ty.Employee_app.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.ty.Employee_app.Dao.HospitalDao;
import com.ty.Employee_app.dto.Hopital;
import com.ty.Employee_app.util.ResponseStructure;
@Service
public class HospitalService {
	
	@Autowired
	HospitalDao dao;
	
	public ResponseStructure<Hopital> saveHopital(Hopital hospital) {
		ResponseStructure<Hopital> responseStructure=new ResponseStructure<Hopital>();
		
		responseStructure.setStatus(HttpStatus.OK.value());
		responseStructure.setMessage("details saved successfully");
		responseStructure.setData(dao.saveHospital(hospital));
		
		return responseStructure;
	}
	

}
