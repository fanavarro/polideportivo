package org.polideportivo.model.dao.impl;

import org.polideportivo.model.dao.api.PersonDao;
import org.polideportivo.model.entities.Person;
import org.springframework.stereotype.Repository;

/**
 * The Class PersonDaoImpl.
 */
@Repository
public class PersonDaoImpl extends GeneralDaoImpl<Person, Integer> implements PersonDao{


}
