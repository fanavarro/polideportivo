package org.angular.model.service.impl;

import org.angular.model.dao.api.SportDao;
import org.angular.model.entities.Sport;
import org.angular.model.service.api.SportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * The Class SportServiceImpl.
 */
@Service
@Transactional
public class SportServiceImpl extends GeneralServiceImpl<Sport, Integer> implements SportService {
	
	/**
	 * Instantiates a new sport service impl.
	 *
	 * @param dao the dao
	 */
	@Autowired
	public SportServiceImpl(SportDao dao){
		super.setDao(dao);
	}


}
