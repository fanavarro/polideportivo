package org.angular.model.service.api;

import java.io.Serializable;
import java.util.List;

public interface GeneralService <C, K extends Serializable>{
	C findById(K id);
	List<C> findAll();
	C save(C c);
	C saveAndFlush(C c);
	<S extends C> List<S> save (Iterable<C> listC);
	void deleteEntity(C c);
	void deleteId(K k);
	void deleteEntities(Iterable<C> listC);
	void deleteIds(Iterable<K> listK);
}
