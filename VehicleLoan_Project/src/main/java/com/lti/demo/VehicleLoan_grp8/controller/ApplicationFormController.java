package com.lti.demo.VehicleLoan_grp8.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;

import com.lti.demo.VehicleLoan_grp8.beans.UserDetail;
import com.lti.demo.VehicleLoan_grp8.beans.VehicleDetail;
import com.lti.demo.VehicleLoan_grp8.services.ApplicationFormServiceImpl;


@CrossOrigin
@RestController
public class ApplicationFormController {

	@Autowired
	ApplicationFormServiceImpl appFormService;

	@PostMapping
	@ResponseBody
	@RequestMapping(value="/addVehicle")
	public String addUser(@RequestBody VehicleDetail vehicle) {
		appFormService.insertVehicleService(vehicle);
		return "{\"status\" : \"Car Added Successfully\"}";
	}
	
	
	
	@GetMapping
	@ResponseBody
	@RequestMapping(value="/getAllVehicles")
	public List<VehicleDetail> getCars() {
		return appFormService.selectAllVehiclesService();
	}
	
	
	
}
