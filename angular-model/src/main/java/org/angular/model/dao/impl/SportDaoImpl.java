package org.angular.model.dao.impl;

import org.angular.model.dao.api.SportDao;
import org.angular.model.entities.Sport;
import org.springframework.stereotype.Repository;

@Repository
public class SportDaoImpl extends GeneralDaoImpl<Sport, Integer> implements
		SportDao {

}
