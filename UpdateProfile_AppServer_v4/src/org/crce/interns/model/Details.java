/**
 * @author Nevil Dsouza
 *
 *	Profile model
 *	DEPENDENCIES: ProfileServiceImpl, UpdateProfileController, ProfileDAOImpl
 */
package org.crce.interns.model;

/*
 * 
CREATE TABLE details (
id VARCHAR(30) PRIMARY KEY,
gender VARCHAR(30)
);


 */


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "details")
public class Details {

	@Id
	@Column(name = "id")	
	private String id;
		
	@Column(name = "gender")	
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
