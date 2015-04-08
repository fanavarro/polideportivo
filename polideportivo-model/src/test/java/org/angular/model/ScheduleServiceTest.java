/**
 * 
 */
package org.angular.model;

import static org.junit.Assert.assertNotNull;

import java.text.ParseException;

import org.angular.model.entities.Schedule;
import org.angular.model.enums.WeekDay;
import org.angular.model.service.api.ScheduleService;
import org.angular.model.utils.DateUtils;
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
		newSchedule.setWeekDay(WeekDay.FRIDAY);
		newSchedule.setStartHour(DateUtils.getDateByString("21:30", "hh:mm"));
		newSchedule.setEndHour(DateUtils.getDateByString("22:30", "hh:mm"));
		
		scheduleService.save(newSchedule);
		assertNotNull(newSchedule.getId());
		
		Schedule storedSchedule = scheduleService.findById(newSchedule.getId());
		assertNotNull(storedSchedule);
	}

}
