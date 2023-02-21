package com.jsp.person.service;

import java.util.List;

import com.jsp.person.dao.CabDao;
import com.jsp.person.dto.Cab;

public class CabService {
	CabDao cabDao = new CabDao();

	public Cab cerateCab(Cab cab) {
		return cabDao.createCab(cab);
	}

	public Cab getCabById(int id) {
		return cabDao.getCabById(id);
	}

	public Cab deleteCabById(int id) {
		return cabDao.deleteCabByID(id);
	}

	public Cab updateCab(int id, String name, String type) {
		return cabDao.updateCab(id, name, type);
	}
	public List<Cab> readAllCab() {
		return cabDao.readAllCabs();
	}
}
