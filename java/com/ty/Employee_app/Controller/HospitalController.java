package com.ty.Employee_app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ty.Employee_app.Service.HospitalService;
import com.ty.Employee_app.dto.Hopital;
import com.ty.Employee_app.util.ResponseStructure;

@Repository
@RequestMapping("hospital")
public class HospitalController {
	
	@Autowired
	HospitalService hospitalService;
	
	@PostMapping
	public ResponseStructure<Hopital>  saveHospital(@RequestBody Hopital hospital) {
		

		return hospitalService.saveHopital(hospital);
		
	}

}
