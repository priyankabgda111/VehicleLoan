package com.lti.demo.VehicleLoan_grp8.beans;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

/**
 * The persistent class for the CAR_DETAILS database table.
 * 
 */
@Entity
@Table(name="VEHICLE_DETAILS")
@NamedQuery(name="VehicleDetail.findAll", query="SELECT c FROM VehicleDetail c")
public class VehicleDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="VEHICLE_ID")
	private Integer vehicleId;

	@Column(name="VEHICLE_MODEL")
	private String vehicleModel;


	@Column(name="ONROAD_PRICE")
	private BigDecimal onroadPrice;

	@Column(name="SHOWROOM_PRICE")
	private BigDecimal showroomPrice;


	//bi-directional many-to-one association to VehicleMaker
	@Column(name="VEHICLE_MAKER")
	private String vehicleMaker;
	
	@Column(name="VEHICLE_TYPE")
	private String vehicleType;
	
//
//	//bi-directional many-to-one association to LoanDetail
//	@OneToMany(mappedBy="vehicleDetail", fetch=FetchType.EAGER)
//	private List<LoanDetail> loanDetails;

	public VehicleDetail() {
	}

	public Integer getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(Integer vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleModel() {
		return vehicleModel;
	}

	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

	public BigDecimal getOnroadPrice() {
		return onroadPrice;
	}

	public void setOnroadPrice(BigDecimal onroadPrice) {
		this.onroadPrice = onroadPrice;
	}

	public BigDecimal getShowroomPrice() {
		return showroomPrice;
	}

	public void setShowroomPrice(BigDecimal showroomPrice) {
		this.showroomPrice = showroomPrice;
	}

	public String getVehicleMaker() {
		return vehicleMaker;
	}

	public void setVehicleMaker(String vehicleMaker) {
		this.vehicleMaker = vehicleMaker;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

//	public List<LoanDetail> getLoanDetails() {
//		return loanDetails;
//	}
//
//	public void setLoanDetails(List<LoanDetail> loanDetails) {
//		this.loanDetails = loanDetails;
//	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "VehicleDetail [vehicleId=" + vehicleId + ", vehicleModel=" + vehicleModel + ", onroadPrice="
				+ onroadPrice + ", showroomPrice=" + showroomPrice + ", vehicleMaker=" + vehicleMaker + ", vehicleType="
				+ vehicleType +  "]";
	}
	
	
	
	
}