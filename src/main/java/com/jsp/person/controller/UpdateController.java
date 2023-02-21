package com.jsp.person.controller;

import com.jsp.person.service.CabService;
import com.jsp.person.service.PersonService;

public class UpdateController {

	public static void main(String[] args) {
     PersonService personService=new PersonService();
     personService.updatePerson(1, "rutuja", "rutujapawar@gamil.com", 485626565);
    
     CabService cabService=new CabService();
     cabService.updateCab(1, "shamal cool Cab", "A.C");
	}

}
