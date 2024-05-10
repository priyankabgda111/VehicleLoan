package com.lti.demo.VehicleLoan_grp8.services;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.demo.VehicleLoan_grp8.beans.LoanOffers;
import com.lti.demo.VehicleLoan_grp8.dao.LoanOffersDaoImpl;

@Service
public class LoanOffersServiceImpl implements LoanOffersService {
 
@Autowired
	
LoanOffersDaoImpl loanRepo;
	
	@Override
	public List<LoanOffers> getAllLoanOffers(BigDecimal amount) {

		System.out.println("Inside Loan Offers Service Impl");
		return loanRepo.getOfferTable(amount);
	}

}