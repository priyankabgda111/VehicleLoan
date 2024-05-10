package com.lti.demo.VehicleLoan_grp8.dao;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lti.demo.VehicleLoan_grp8.beans.LoanOffers;

@Repository
public class LoanOffersDaoImpl extends BaseRepository implements LoanOffersDao {
	
	public LoanOffersDaoImpl() {
		System.out.println("LoanOfferRepositoryImpl() constructed");
	}

	@Override
	public List<LoanOffers> getOfferTable(BigDecimal amount) {
		EntityManager entityManager=getEntityManager();
		System.out.println("In repo");
		Query query=entityManager.createQuery("Select o from LoanOffers o where o.offerAmount<=:amount");	
		query.setParameter("amount", amount);
		
		
		List<LoanOffers> offerTable=query.getResultList();
		System.out.println(query.getResultList());
		
		return offerTable;
	}

}