package com.lti.demo.VehicleLoan_grp8.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.demo.VehicleLoan_grp8.beans.VehicleDetail;

@Repository
public class ApplicationFormDaoImpl extends BaseRepository {

	
	public List<VehicleDetail> selectAllVehicles() {
		EntityManager entityManager = super.getEntityManager();
		Query query = entityManager.createQuery("from VehicleDetail");
		return query.getResultList();
	}
	

	@Transactional
	public Integer insertCar(VehicleDetail car) {
		System.out.println("Insert car Repo called");
		EntityManager entityManager = super.getEntityManager();
		entityManager.persist(car);
		System.out.println("Car Successfully added: "+car.getVehicleId());
		return car.getVehicleId();	
	}
}
