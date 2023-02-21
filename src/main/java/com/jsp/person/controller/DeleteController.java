package com.jsp.person.controller;

import com.jsp.person.service.CabService;
import com.jsp.person.service.PersonService;

public class DeleteController {

	public static void main(String[] args) {
	  PersonService personService=new PersonService();
	  personService.deletePersonById(3);
	  
	  CabService cabService=new CabService();
	  cabService.deleteCabById(3);

	}

}
