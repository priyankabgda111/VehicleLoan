package com.lti.demo.VehicleLoan_grp8.dao;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.lti.demo.VehicleLoan_grp8.beans.UserDetail;

@Repository

public abstract class BaseRepository {
	
	@PersistenceContext
	EntityManager entityManager;

	public EntityManager getEntityManager() {
		System.out.println("BaseRepository: getting entityManager");
		return entityManager;
	}


}



