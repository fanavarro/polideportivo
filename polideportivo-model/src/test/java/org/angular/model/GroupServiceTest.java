package org.angular.model;

import static org.junit.Assert.*;

import java.util.List;

import org.angular.model.entities.Group;
import org.angular.model.service.api.GroupService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:META-INF/test-context.xml")
public class GroupServiceTest {

	@Autowired
	private GroupService groupService;
	
	@Test
	public void test() {
		List<Group> groups = groupService.findAll();
		assertEquals(2, groups.size());
	}

}
