package org.polideportivo.model.dao.impl;

import org.polideportivo.model.dao.api.GroupDao;
import org.polideportivo.model.entities.Group;
import org.springframework.stereotype.Repository;

@Repository
public class GroupDaoImpl extends GeneralDaoImpl<Group,Integer> implements GroupDao {

}
