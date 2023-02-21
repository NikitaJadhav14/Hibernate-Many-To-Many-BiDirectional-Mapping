package com.jsp.person.controller;

import com.jsp.person.dto.Cab;
import com.jsp.person.dto.Person;
import com.jsp.person.service.CabService;
import com.jsp.person.service.PersonService;

public class SaveController {

	public static void main(String[] args) {
		PersonService personService = new PersonService();
		CabService cabService = new CabService();

		Person person = new Person();
		person.setName("vikas");
		person.setEmail("vikasshepunde@gamil.com");
		person.setNo(982662645);
		personService.createPerson(person);

		Cab cab = new Cab();
		cab.setName("Dolphin cool cab");
		cab.setType("A.C");
		cabService.cerateCab(cab);

		Cab cab1 = new Cab();
		cab1.setName("Aman cab");
		cab1.setType("Non-A.C");
		cabService.cerateCab(cab1);

		Cab cab2 = new Cab();
		cab2.setName("Shiv baba cool cab");
		cab2.setType("A.C");
		cabService.cerateCab(cab2);

	}

}
