package org.angular.model.dao.api;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GeneralDao<C, K extends Serializable> extends JpaRepository<C, K>{

}
