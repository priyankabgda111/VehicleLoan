package com.lti.demo.VehicleLoan_grp8.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.demo.VehicleLoan_grp8.beans.Login;
import com.lti.demo.VehicleLoan_grp8.beans.UserDetail;
import com.lti.demo.VehicleLoan_grp8.dao.LoginRepository;
//
//import com.lti.vehicleloan.layer2.Login;
//import com.lti.vehicleloan.layer2.UserDetail;
//import com.lti.vehicleloan.layer3.LoginRepository;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginRepository loginRepository;

	public UserDetail validateUser(Login login) {
		System.out.println("In service");
		if (loginRepository.fetchUser(login) != null)
		{
			return loginRepository.fetchUser(login);
		}
		return null;
	
	}
	
	
}
