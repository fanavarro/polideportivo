package org.angular.model.service.impl;

import org.angular.model.dao.api.PersonDao;
import org.angular.model.entities.Person;
import org.angular.model.service.api.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * The Class PersonServiceImpl.
 */
@Service
@Transactional
public class PersonServiceImpl extends GeneralServiceImpl<Person, Integer> implements PersonService{
	

	/**
	 * Instantiates a new person service impl.
	 *
	 * @param personDao the person dao
	 */
	@Autowired
	public PersonServiceImpl(PersonDao personDao){
		super.setDao(personDao);
	}




	

}