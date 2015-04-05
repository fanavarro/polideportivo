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
@Transactional
public class PersonServiceTest {

	@Autowired
	private PersonService personService;

	@Autowired
	private SportService sportService;

	@Autowired
	private Person person;

	@Autowired
	private List<Sport> sportList;

	@Test
	public void test() {
		sportService.save(sportList);
		List<Sport> availableSports = sportService.findAll();
		assertNotNull(availableSports);
		assertEquals(4, availableSports.size());
		List<Sport> personSports = new ArrayList<Sport>();
		personSports.add(availableSports.get(0));
		personSports.add(availableSports.get(1));
		person.setSports(personSports);
		personService.save(person);
		List<Person> lista = personService.findAll();
		assertNotNull(lista);
		assertEquals(1, lista.size());
		Person personStored = personService.findById(person.getId());
		assertNotNull(personStored);
		assertNotNull(personStored.getSports());
		
		Sport sport = sportService.findById(1);
		assertNotNull(sport);
	}

}
