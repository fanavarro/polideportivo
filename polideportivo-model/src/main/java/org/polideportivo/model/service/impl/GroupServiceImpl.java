package org.polideportivo.model.service.impl;

import org.polideportivo.model.dao.api.GroupDao;
import org.polideportivo.model.entities.Group;
import org.polideportivo.model.service.api.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupServiceImpl extends GeneralServiceImpl<Group,Integer> implements GroupService {

	@Autowired
	public GroupServiceImpl(GroupDao dao){
		super.setDao(dao);
	}
}
