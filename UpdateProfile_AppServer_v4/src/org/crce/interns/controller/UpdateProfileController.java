/**
 * @author Nevil Dsouza
 *
 *	Main controller
 *	DEPENDENCIES: ProfileServiceImpl, Profile, ProfileDAOImpl
 */
package org.crce.interns.controller;


import org.crce.interns.beans.*;
import org.crce.interns.service.impl.ProfileServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class UpdateProfileController {
	
	
	//private ProfileService profileService;
	@Autowired
	private ProfileServiceImpl profileService;
		
	@RequestMapping(value="/", method = RequestMethod.GET)
	public ModelAndView index() {
		
		System.out.println("Inside Controller");
		
		ModelAndView model=null;
		
		model = new ModelAndView("index");
				
		return model;
	}
//------------------------------------------------------------------------------------------------------ //
	
	/**	GET details from database
	*	
	*	Creates hardcoded user by setName and setID on user.This value is supposed to be retrieved from Session.
	*	This enhancement will be added later
	*	@param	None
	*	@return MOdelAndView viewprofile page with name
	*
	*/
	
	
	
	@RequestMapping(value="/edit", method = RequestMethod.POST)
	public ModelAndView login(@RequestParam Map<String, String> params) {
		
		
		
		System.out.println("Inside Controller");
		
		ModelAndView model=null;
		
		ProfileBean p=new ProfileBean();
		DetailsBean d=new DetailsBean();
		
		
		p.setUsername(params.get("id"));
		p.setName(params.get("name"));
		
		d.setUsername(params.get("id"));
		d.setGender(params.get("gender"));
		
			
		
		p = profileService.saveProfile(p);
		d = profileService.saveProfile(d);
		
		model = new ModelAndView("viewprofile");
		
		model.addObject("p",p);
		model.addObject("d",d);
		
		return model;
	}
	
	
		
}


/*

*/