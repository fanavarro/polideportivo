package org.polideportivo.model.service.impl;

import org.polideportivo.model.dao.api.ScheduleDao;
import org.polideportivo.model.entities.Schedule;
import org.polideportivo.model.service.api.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * The Class ScheduleServiceImpl.
 */
@Service
@Transactional
public class ScheduleServiceImpl extends GeneralServiceImpl<Schedule, Integer> implements ScheduleService {

	/**
	 * Instantiates a new schedule service impl.
	 *
	 * @param dao the dao
	 */
	@Autowired
	public ScheduleServiceImpl(ScheduleDao dao){
		super.setDao(dao);
	}
}
