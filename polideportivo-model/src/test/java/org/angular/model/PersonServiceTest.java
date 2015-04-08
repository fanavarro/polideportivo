package org.angular.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.List;

import org.angular.model.entities.Person;
import org.angular.model.service.api.PersonService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:META-INF/test-context.xml")
public class PersonServiceTest {

	@Autowired
	private PersonService personService;

	@Autowired
	private Person person;

	@Test
	public void test() {
		List<Person> list = personService.findAll();
		int sizeBeforeInsert = list.size();
		personService.save(person);
		list = personService.findAll();
		int sizeAfterInsert = list.size();
		assertNotNull(list);
		assertFalse(sizeAfterInsert == 0);
		assertEquals(sizeBeforeInsert, sizeAfterInsert - 1);
		Person personStored = personService.findById(person.getId());
		assertNotNull(personStored);
		
		personService.deleteEntity(personStored);
		list = personService.findAll();
		int sizeAfterDelete = list.size();
		assertEquals(sizeBeforeInsert, sizeAfterDelete);
		
		personStored = personService.findById(person.getId());
		assertNull(personStored);
	}

}
