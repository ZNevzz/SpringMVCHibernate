/**
 * @author Nevil Dsouza
 *
 *	Profile DAO
 *	DEPENDENCIES: ProfileServiceImpl, UpdateProfileController, Profile
 */
package org.crce.interns.dao.impl;

import org.crce.interns.model.*;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("profileDAO")
//public class ProfileDAOImpl implements ProfileDAO{
public class ProfileDAOImpl{

	@Autowired
	private SessionFactory sessionFactory;
	
	/*
	public void addProfile(Profile user) {
		sessionFactory.getCurrentSession().save(user);
	}*/
	
	
	/**	GET details from database
	*	
	*	@param	Profile user
	*	@return Profile result 
	*
	*/
	public Profile getProfile(Profile user) {
		System.out.println("before get");
		Profile result = (Profile)sessionFactory.getCurrentSession().saveOrUpdate(Profile.class, user.getUsername());
		System.out.println("after get");
		return result;
	}
	
	public Details getProfile(Details user) {
		System.out.println("before get");
		Details result = (Details)sessionFactory.getCurrentSession().saveOrUpdate(Details.class, user.getUsername());
		System.out.println("after get");
		return result;
	}
}
