package com.lti.demo.VehicleLoan_grp8.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.demo.VehicleLoan_grp8.beans.Login;
import com.lti.demo.VehicleLoan_grp8.beans.UserDetail;
import com.lti.demo.VehicleLoan_grp8.services.LoginService;


@RestController
@CrossOrigin
public class LoginController {
	@Autowired
	private LoginService loginService;

	@PostMapping
	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public UserDetail loginUser(@RequestBody Login login) {
		UserDetail user = loginService.validateUser(login);
	
		if (user != null) {
			System.out.println("user is not null");
			return user;
		}
		else {
			System.out.println("user is  null");
		return null;
	}
	}
	
}
