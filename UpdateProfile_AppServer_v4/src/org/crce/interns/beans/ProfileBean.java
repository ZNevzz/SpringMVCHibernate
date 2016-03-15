/**
 * @author Nevil Dsouza
 *
 *	Profile model
 *	DEPENDENCIES: ProfileServiceImpl, UpdateProfileController, ProfileDAOImpl
 */
package org.crce.interns.beans;

/*
 * 
CREATE TABLE profile (
id VARCHAR(30) PRIMARY KEY,
name VARCHAR(30)
);


 */


public class Profile {


	private String id;
		

	private String name;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
	
	
}
