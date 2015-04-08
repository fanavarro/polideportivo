package org.angular.model.service.impl;

import org.angular.model.complexId.CourtHireId;
import org.angular.model.dao.api.CourtHireDao;
import org.angular.model.entities.CourtHire;
import org.angular.model.service.api.PersonCourtScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourtHireServiceImpl extends GeneralServiceImpl<CourtHire,CourtHireId> implements PersonCourtScheduleService {
	@Autowired
	public CourtHireServiceImpl(CourtHireDao dao){
		super.setDao(dao);
	}
}
