package com.quazar.dao;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.quazar.models.UserModel;

public class UserDao {
	public static UserModel createUser(String socialId, String firstName, String lastName, String ip, int sex){
		EntityManager em=EMF.get().createEntityManager();
		UserModel user=new UserModel(socialId, firstName, lastName, ip, new Date(), new Date(), sex);
		EntityTransaction tx = em.getTransaction();
		tx.begin();
			em.persist(user);
			em.flush();
		tx.commit();
		em.close();
		return user;
	}
	public static UserModel getUser(String socialId){
		EntityManager em=EMF.get().createEntityManager();		
		UserModel user=(UserModel)em.createQuery(String.format("SELECT u FROM UserModel u WHERE u.socialId='%s'", socialId)).getSingleResult();
		em.close();
		return user;
	}
	public static UserModel updateUser(UserModel user){
		EntityManager em=EMF.get().createEntityManager();		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
			em.merge(user);			
		tx.commit();
		em.close();
		return user;
	}
}
