package com.ty.Employee_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.Employee_app.dto.Branches;
import com.ty.Employee_app.dto.Hopital;

public interface HospitalRepo extends JpaRepository<Hopital, Integer>{

}


