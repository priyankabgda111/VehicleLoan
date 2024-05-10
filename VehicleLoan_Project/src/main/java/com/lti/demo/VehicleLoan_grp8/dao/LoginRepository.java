package com.lti.demo.VehicleLoan_grp8.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.demo.VehicleLoan_grp8.beans.Login;
import com.lti.demo.VehicleLoan_grp8.beans.UserDetail;
import com.sun.xml.bind.v2.util.QNameMap.Entry;

@Repository
public class LoginRepository extends BaseRepository {

	public UserDetail fetchUser(Login login) {
		System.out.println("in repos 1");
		
		EntityManager entityManager = super.getEntityManager();
		System.out.println(login);
		//entityManager.createQuery("from UserDetail", Entry.class);
		Query query = entityManager.createQuery(
				"Select user from UserDetail as user where user.email=:emailId and user.password=:password");
		
		query.setParameter("emailId", login.getEmailId());
		query.setParameter("password", login.getPassword());
	
		if (query.getResultList().size() > 0) {
			System.out.println("in repos");
			System.out.println(query.getResultList());
			return (UserDetail) (query.getResultList().get(0));
		}
		return null;
	}
	
	
}
