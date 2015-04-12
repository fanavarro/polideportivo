package org.polideportivo.model.service.impl;

import org.polideportivo.model.dao.api.CourtDao;
import org.polideportivo.model.entities.Court;
import org.polideportivo.model.service.api.CourtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourtServiceImpl extends GeneralServiceImpl<Court, Integer> implements CourtService{
	@Autowired
	public CourtServiceImpl(CourtDao dao){
		super.setDao(dao);
	}
}
