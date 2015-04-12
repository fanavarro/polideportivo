package org.polideportivo.model;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.polideportivo.model.entities.Sport;
import org.polideportivo.model.service.api.SportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:META-INF/test-context.xml")
public class SportServiceTest {

	@Autowired
	private SportService sportService;
	
	
	@Test
	public void test() {
		List<Sport> storedSports;
		
		storedSports = sportService.findAll();
		assertEquals(4, storedSports.size());
	}

}
