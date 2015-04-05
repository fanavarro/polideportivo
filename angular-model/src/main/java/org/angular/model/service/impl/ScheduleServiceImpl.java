package org.angular.model.service.impl;

import org.angular.model.dao.api.ScheduleDao;
import org.angular.model.entities.Schedule;
import org.angular.model.service.api.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ScheduleServiceImpl extends GeneralServiceImpl<Schedule, Integer> implements ScheduleService {

	@Autowired
	public ScheduleServiceImpl(ScheduleDao dao){
		super.setDao(dao);
	}
}
