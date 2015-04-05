package org.angular.model.dao.impl;

import org.angular.model.dao.api.PersonDao;
import org.angular.model.entities.Person;
import org.springframework.stereotype.Repository;

/**
 * The Class PersonDaoImpl.
 */
@Repository
public class PersonDaoImpl extends GeneralDaoImpl<Person, Integer> implements PersonDao{


}
