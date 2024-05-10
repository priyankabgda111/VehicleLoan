package com.lti.demo.VehicleLoan_grp8.beans;


import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="LOAN_OFFERS")
@NamedQuery(name="LoanOffers.findAll", query="SELECT o FROM LoanOffers o")
public class LoanOffers implements Serializable {
	

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="OFFER_ID")
	private Integer offerId;

	@Column(name="OFFER_AMOUNT")
	private BigDecimal offerAmount;

	@Column(name="OFFER_RATE")
	private BigDecimal offerRate;

	@Column(name="OFFER_TENURE")
	private Integer offerTenure;
	
	@Column(name="OFFER_EMI")
	private double offerEmi;

	public double getOfferEmi() {
		return offerEmi;
	}

	public void setOfferEmi(double offerEmi) {
		this.offerEmi = offerEmi;
	}

	public LoanOffers() {
	}

	public Integer getOfferId() {
		return this.offerId;
	}

	public void setOfferId(Integer offerId) {
		this.offerId = offerId;
	}

	public BigDecimal getOfferAmount() {
		return this.offerAmount;
	}

	public void setOfferAmount(BigDecimal offerAmount) {
		this.offerAmount = offerAmount;
	}

	public BigDecimal getOfferRate() {
		return this.offerRate;
	}

	public void setOfferRate(BigDecimal offerRate) {
		this.offerRate = offerRate;
	}

	public Integer getOfferTenure() {
		return this.offerTenure;
	}

	public void setOfferTenure(Integer offerTenure) {
		this.offerTenure = offerTenure;
	}

}