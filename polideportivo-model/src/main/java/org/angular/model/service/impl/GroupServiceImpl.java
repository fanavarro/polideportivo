package org.angular.model.service.impl;

import org.angular.model.dao.api.GroupDao;
import org.angular.model.entities.Group;
import org.angular.model.service.api.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupServiceImpl extends GeneralServiceImpl<Group,Integer> implements GroupService {

	@Autowired
	public GroupServiceImpl(GroupDao dao){
		super.setDao(dao);
	}
}
