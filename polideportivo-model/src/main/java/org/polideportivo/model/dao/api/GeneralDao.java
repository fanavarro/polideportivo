package org.polideportivo.model.dao.api;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The Interface GeneralDao.
 *
 * @param <C> the generic type
 * @param <K> the key type
 */
public interface GeneralDao<C, K extends Serializable> extends JpaRepository<C, K>{

}
