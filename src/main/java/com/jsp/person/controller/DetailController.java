package com.jsp.person.controller;

import com.jsp.person.service.CabService;
import com.jsp.person.service.PersonService;

public class DetailController {

	public static void main(String[] args) {
		PersonService personService=new PersonService();
		personService.gePersonById(1);
		
		CabService cabService=new CabService();
		cabService.getCabById(1);

	}

}
