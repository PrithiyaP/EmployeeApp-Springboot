package com.ty.Employee_app.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.Employee_app.dto.Hopital;
import com.ty.Employee_app.repository.HospitalRepo;

@Repository
public class HospitalDao {
	
	@Autowired
	HospitalRepo hospitalrepo;

	public Hopital saveHospital(Hopital hospital) {
		return hospitalrepo.save(hospital);
		
	}
}
