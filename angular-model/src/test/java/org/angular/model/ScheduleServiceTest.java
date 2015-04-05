/**
 * 
 */
package org.angular.model;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.angular.model.entities.Schedule;
import org.angular.model.enums.WeekDay;
import org.angular.model.service.api.ScheduleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author fabad
 *
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:META-INF/test-context.xml")
public class ScheduleServiceTest {
	@Autowired
	private ScheduleService scheduleService;

	/**
	 * Test method for {@link org.angular.model.service.impl.GeneralServiceImpl#findAll()}.
	 * @throws ParseException 
	 */
	@Test
	public void test() throws ParseException {
		Schedule newSchedule = new Schedule();
		newSchedule.setWeekDay(WeekDay.TUESDAY);
		newSchedule.setStartHour(this.getDate("21:30"));
		newSchedule.setEndHour(this.getDate("22:30"));
		
		scheduleService.save(newSchedule);
		assertNotNull(newSchedule.getId());
	}
	
	private Date getDate(String stringDate) throws ParseException{
		SimpleDateFormat dt = new SimpleDateFormat("hh:mm"); 
		Date date = dt.parse(stringDate); 
		return date;
		
	}

}
