package com.lti.demo.VehicleLoan_grp8.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.demo.VehicleLoan_grp8.beans.VehicleDetail;
import com.lti.demo.VehicleLoan_grp8.dao.ApplicationFormDaoImpl;

@Service
public class ApplicationFormServiceImpl implements ApplicationFormService {
	@Autowired
	ApplicationFormDaoImpl appFormRepo;
	
	

	//Select All Cars
	@Override
	public List<VehicleDetail> selectAllVehiclesService() {
		return appFormRepo.selectAllVehicles();
	}

	//Insert a New Car in the database
	@Override
	public Integer insertVehicleService(VehicleDetail vehicle) {
		System.out.println("Insert Car Service Called");
		if(vehicle != null) {
			Integer carId = appFormRepo.insertCar(vehicle);
			return carId;
		}
		return null;	
	}

	
}
