package org.angular.model.dao.impl;

import org.angular.model.dao.api.GroupDao;
import org.angular.model.entities.Group;
import org.springframework.stereotype.Repository;

@Repository
public class GroupDaoImpl extends GeneralDaoImpl<Group,Integer> implements GroupDao {

}
