package org.polideportivo.model.service.impl;

import org.polideportivo.model.complexId.CourtHireId;
import org.polideportivo.model.dao.api.CourtHireDao;
import org.polideportivo.model.entities.CourtHire;
import org.polideportivo.model.service.api.PersonCourtScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourtHireServiceImpl extends GeneralServiceImpl<CourtHire,CourtHireId> implements PersonCourtScheduleService {
	@Autowired
	public CourtHireServiceImpl(CourtHireDao dao){
		super.setDao(dao);
	}
}
