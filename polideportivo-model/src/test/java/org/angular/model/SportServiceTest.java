package org.angular.model;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.angular.model.entities.Sport;
import org.angular.model.service.api.SportService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:META-INF/test-context.xml")
public class SportServiceTest {

	@Autowired
	private SportService sportService;
	
	@Autowired
	private List<Sport> sportlist;
	
	@Test
	public void test() {
		List<Sport> storedSports;
		
		storedSports = sportService.findAll();
		assertEquals(0, storedSports.size());
		
		sportService.save(sportlist);
		
		storedSports = sportService.findAll();
		assertEquals(sportlist.size(), storedSports.size());
	}

}
