package org.angular.model;

import static org.junit.Assert.assertTrue;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.angular.model.entities.Court;
import org.angular.model.entities.CourtHire;
import org.angular.model.entities.Person;
import org.angular.model.service.api.CourtService;
import org.angular.model.service.api.PersonCourtScheduleService;
import org.angular.model.service.api.PersonService;
import org.angular.model.service.api.ScheduleService;
import org.angular.model.service.api.SportService;
import org.angular.model.utils.DateUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:META-INF/test-context.xml")
public class CourtHireTest {

	@Autowired
	private PersonCourtScheduleService personCourtScheduleService;
	
	@Autowired
	private PersonService personService;
	
	@Autowired
	private SportService sportService;
	
	@Autowired
	private CourtService courtService;
	
	@Autowired
	private ScheduleService scheduleService;
	
	@Test
	public void test() throws ParseException {
		List<CourtHire> listPersonCourtSchedule = this.createPersonCourtSchedule();
		int sizeBeforeInsert = personCourtScheduleService.findAll().size();
		personCourtScheduleService.save(listPersonCourtSchedule);
		int sizeAfterInsert = personCourtScheduleService.findAll().size();
		assertTrue(sizeBeforeInsert < sizeAfterInsert);
		
	}
	
	private List<CourtHire> createPersonCourtSchedule() throws ParseException{
		List<CourtHire> listPersonCourtSchedule;
		Person fran = personService.findById(1);
		Person antonio = personService.findById(2);
		Court tennisCourt1 = courtService.findById(1);
		
		CourtHire franHire1 = new CourtHire();
		CourtHire franHire2 = new CourtHire();
		franHire1.setCourt(tennisCourt1);
		franHire1.setPerson(fran);
		franHire1.setDate(DateUtils.getDateByString("2015-04-08 10:30:00", "yyyy-MM-dd HH:mm:ss"));
		franHire2.setCourt(tennisCourt1);
		franHire2.setPerson(fran);
		franHire2.setDate(DateUtils.getDateByString("2015-04-10 10:30:00", "yyyy-MM-dd HH:mm:ss"));
		
		CourtHire antonioHire1 = new CourtHire();
		CourtHire antonioHire2 = new CourtHire();
		antonioHire1.setCourt(tennisCourt1);
		antonioHire1.setPerson(antonio);
		antonioHire1.setDate(DateUtils.getDateByString("2015-04-09 10:30:00", "yyyy-MM-dd HH:mm:ss"));
		antonioHire2.setCourt(tennisCourt1);
		antonioHire2.setPerson(antonio);
		antonioHire2.setDate(DateUtils.getDateByString("2015-04-11 10:30:00", "yyyy-MM-dd HH:mm:ss"));
		
		listPersonCourtSchedule = new ArrayList<CourtHire>();
		listPersonCourtSchedule.add(franHire1);
		listPersonCourtSchedule.add(antonioHire1);
		listPersonCourtSchedule.add(franHire2);
		listPersonCourtSchedule.add(antonioHire2);
		
		return listPersonCourtSchedule;
	}
	

}
