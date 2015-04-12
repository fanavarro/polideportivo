package org.polideportivo.model.dao.impl;

import org.polideportivo.model.complexId.CourtHireId;
import org.polideportivo.model.dao.api.CourtHireDao;
import org.polideportivo.model.entities.CourtHire;
import org.springframework.stereotype.Repository;

@Repository
public class CourtHireDaoImpl extends GeneralDaoImpl<CourtHire, CourtHireId> implements CourtHireDao{

}
