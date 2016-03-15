/**
 * @author Nevil Dsouza
 *
 *	Profile model
 *	DEPENDENCIES: ProfileServiceImpl, UpdateProfileController, ProfileDAOImpl
 */
package org.crce.interns.beans;

/*
 * 
CREATE TABLE details (
id VARCHAR(30) PRIMARY KEY,
gender VARCHAR(30)
);


 */

public class Details {


	private String id;
		

	private String gender;
	

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
	
	
}
