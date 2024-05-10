package com.lti.demo.VehicleLoan_grp8.dao;



import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.lti.demo.VehicleLoan_grp8.beans.LoanOffers;



@Repository
public interface LoanOffersDao {
	
	List<LoanOffers> getOfferTable(BigDecimal amount);
	
}