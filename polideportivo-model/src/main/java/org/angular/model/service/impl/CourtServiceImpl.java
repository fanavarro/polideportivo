package org.angular.model.service.impl;

import org.angular.model.dao.api.CourtDao;
import org.angular.model.entities.Court;
import org.angular.model.service.api.CourtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourtServiceImpl extends GeneralServiceImpl<Court, Integer> implements CourtService{
	@Autowired
	public CourtServiceImpl(CourtDao dao){
		super.setDao(dao);
	}
}
