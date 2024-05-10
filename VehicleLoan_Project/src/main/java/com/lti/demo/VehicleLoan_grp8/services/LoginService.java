package com.lti.demo.VehicleLoan_grp8.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lti.demo.VehicleLoan_grp8.beans.Login;
import com.lti.demo.VehicleLoan_grp8.beans.UserDetail;

@Service
public interface LoginService {
	public UserDetail validateUser(Login login);

	
}
