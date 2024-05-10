package com.lti.demo.VehicleLoan_grp8.services;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Service;

import com.lti.demo.VehicleLoan_grp8.beans.LoanOffers;


@Service
public interface LoanOffersService {

	List<LoanOffers> getAllLoanOffers(BigDecimal amount);
	
	
}