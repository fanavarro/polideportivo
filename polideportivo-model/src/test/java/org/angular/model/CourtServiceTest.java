package org.angular.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

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
	
	@Autowired
	private List<Sport> sportList;
	
	@Test
	public void test() {
		sportService.save(sportList);
		
		List<Court> listCourt = new ArrayList<Court>();
		
		Court tennisCourt1 = new Court();
		tennisCourt1.setDescription("Tennis Court 1");
		tennisCourt1.setSport(sportList.get(0));
		
		Court tennisCourt2 = new Court();
		tennisCourt2.setDescription("Tennis Court 2");
		tennisCourt2.setSport(sportList.get(0));
		
		Court footballCourt = new Court();
		footballCourt.setDescription("Football Court");
		footballCourt.setSport(sportList.get(1));
		
		Court basketballCourt = new Court();
		basketballCourt.setDescription("Basketball Court");
		basketballCourt.setSport(sportList.get(2));
		
		Court atletismCourt = new Court();
		atletismCourt.setDescription("Atletism Court");
		atletismCourt.setSport(sportList.get(3));
		
		
		listCourt.add(tennisCourt1);
		listCourt.add(tennisCourt2);
		listCourt.add(footballCourt);
		listCourt.add(atletismCourt);
		listCourt.add(basketballCourt);
		
		courtService.save(listCourt);
		
		List<Court> courtsStored = courtService.findAll();
		assertNotNull(courtsStored);
		assertEquals(5, courtsStored.size());
		
		
	}

}
