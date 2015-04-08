package org.angular.model.dao.impl;

import org.angular.model.complexId.CourtHireId;
import org.angular.model.dao.api.CourtHireDao;
import org.angular.model.entities.CourtHire;
import org.springframework.stereotype.Repository;

@Repository
public class CourtHireDaoImpl extends GeneralDaoImpl<CourtHire, CourtHireId> implements CourtHireDao{

}
