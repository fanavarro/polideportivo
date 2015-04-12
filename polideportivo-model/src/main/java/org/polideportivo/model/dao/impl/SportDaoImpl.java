package org.polideportivo.model.dao.impl;

import org.polideportivo.model.dao.api.SportDao;
import org.polideportivo.model.entities.Sport;
import org.springframework.stereotype.Repository;

/**
 * The Class SportDaoImpl.
 */
@Repository
public class SportDaoImpl extends GeneralDaoImpl<Sport, Integer> implements
		SportDao {

}
