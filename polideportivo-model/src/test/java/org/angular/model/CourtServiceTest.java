package org.angular.model;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.angular.model.entities.Court;
import org.angular.model.entities.Sport;
import org.angular.model.service.api.CourtService;
import org.angular.model.service.api.SportService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:META-INF/test-context.xml")
public class CourtServiceTest {

	@Autowired
	private CourtService courtService;
	
	@Autowired
	private SportService sportService;
	
	@Test
	public void test() {
		
		List<Sport> sportList = sportService.findAll();
		
		List<Court> listCourt = new ArrayList<Court>();
		
		Court tennisCourt1 = new Court();
		tennisCourt1.setDescription("Tennis Court 1");
		tennisCourt1.setSport(sportList.get(0));

		
		
		listCourt.add(tennisCourt1);
		int sizeBeforeInsert = courtService.findAll().size();
		courtService.save(listCourt);
		int sizeAfterInsert = courtService.findAll().size();
		
		assertEquals(sizeBeforeInsert, sizeAfterInsert - 1);
		
		
	}

}
