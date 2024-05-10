package com.lti.demo.VehicleLoan_grp8.controller;


import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.demo.VehicleLoan_grp8.beans.LoanOffers;
import com.lti.demo.VehicleLoan_grp8.services.LoanOffersServiceImpl;

@RestController
@CrossOrigin
public class LoanOffersController {

	@Autowired
	LoanOffersServiceImpl loanService;
	public LoanOffersController()
	{
		System.out.println("LoanOfferJPAController() constructed");
	}
	
	
	@GetMapping
	@ResponseBody
	@RequestMapping(value="/getAllLoanOffers/{amount}")
	public List<LoanOffers> getAllLoanOffers(@PathVariable BigDecimal amount){
		System.out.println("IN controller");
		return loanService.getAllLoanOffers(amount);
	
}
}