package org.angular.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.angular.model.entities.Person;
import org.angular.model.entities.Sport;
import org.angular.model.service.api.PersonService;
import org.angular.model.service.api.SportService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:META-INF/test-context.xml")
public class PersonServiceTest {

	@Autowired
	private PersonService personService;

	@Autowired
	private Person person;

	@Test
	public void test() {
		personService.save(person);
		List<Person> lista = personService.findAll();
		assertNotNull(lista);
		assertEquals(1, lista.size());
		Person personStored = personService.findById(person.getId());
		assertNotNull(personStored);
	}

}
