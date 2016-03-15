/**
 * @author Nevil Dsouza
 *
 *	Profile Service
 *	DEPENDENCIES: UpdateProfileController, Profile, ProfileDAOImpl
 *
 */

package org.crce.interns.service.impl;

import org.crce.interns.model.*;
import org.crce.interns.beans.*;
import org.crce.interns.dao.impl.ProfileDAOImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("profileService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
//public class ProfileServiceImpl implements ProfileService{
public class ProfileServiceImpl{
	
	//private ProfileDAO profileDAOImpl;
	@Autowired
	private ProfileDAOImpl profileDAO;
	
	
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public ProfileBean saveProfile(ProfileBean pb) {
		
		Profile p=new Profile();
		
		
		BeanUtils.copyProperties(pb,p);
		
		Profile result = profileDAO.updateUserDetails(p);
		
		
		if(result == null){
			System.out.println("Returned NULL");
		}
		
		BeanUtils.copyProperties(result,pb);
		
		
		return pb;
	}
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public DetailsBean saveProfile(DetailsBean db) {
		
		Details d=new Details();
		
		
		BeanUtils.copyProperties(db,d);
		
		Details result = profileDAO.updateUserDetails(d);
		
		
		if(result == null){
			System.out.println("Returned NULL");
		}
		
		BeanUtils.copyProperties(result,db);
		
		
		return db;
	}
}
