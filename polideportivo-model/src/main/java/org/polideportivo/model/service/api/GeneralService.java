package org.polideportivo.model.service.api;

import java.io.Serializable;
import java.util.List;

/**
 * The Interface GeneralService.
 *
 * @param <C> the generic type
 * @param <K> the key type
 */
public interface GeneralService <C, K extends Serializable>{
	
	/**
	 * Find by id.
	 *
	 * @param id the id
	 * @return the c
	 */
	C findById(K id);
	
	/**
	 * Find all.
	 *
	 * @return the list
	 */
	List<C> findAll();
	
	/**
	 * Save.
	 *
	 * @param c the c
	 * @return the c
	 */
	C save(C c);
	
	/**
	 * Save and flush.
	 *
	 * @param c the c
	 * @return the c
	 */
	C saveAndFlush(C c);
	
	/**
	 * Save.
	 *
	 * @param <S> the generic type
	 * @param listC the list c
	 * @return the list
	 */
	<S extends C> List<S> save (Iterable<C> listC);
	
	/**
	 * Delete entity.
	 *
	 * @param c the c
	 */
	void deleteEntity(C c);
	
	/**
	 * Delete id.
	 *
	 * @param k the k
	 */
	void deleteId(K k);
	
	/**
	 * Delete entities.
	 *
	 * @param listC the list c
	 */
	void deleteEntities(Iterable<C> listC);
	
	/**
	 * Delete ids.
	 *
	 * @param listK the list k
	 */
	void deleteIds(Iterable<K> listK);
}
