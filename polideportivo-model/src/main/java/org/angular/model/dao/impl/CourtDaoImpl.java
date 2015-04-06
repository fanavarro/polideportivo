package org.angular.model.dao.impl;

import org.angular.model.dao.api.CourtDao;
import org.angular.model.entities.Court;
import org.springframework.stereotype.Repository;

@Repository
public class CourtDaoImpl extends GeneralDaoImpl<Court, Integer> implements CourtDao{

}
