package com.lti.demo.VehicleLoan_grp8.services;


import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.lti.demo.VehicleLoan_grp8.beans.VehicleDetail;


@Service
public interface ApplicationFormService {

	
	
	Integer insertVehicleService(VehicleDetail car);
	List<VehicleDetail> selectAllVehiclesService();
	
}
