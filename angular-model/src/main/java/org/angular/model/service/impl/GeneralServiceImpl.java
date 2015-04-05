package org.angular.model.service.impl;

import java.io.Serializable;
import java.util.List;

import org.angular.model.dao.api.GeneralDao;
import org.angular.model.service.api.GeneralService;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public abstract class GeneralServiceImpl <C, K extends Serializable> implements GeneralService<C, K> {

	private GeneralDao<C,K> generalDao;
	
	
	@Override
	public C findById(K id) {
		return generalDao.findOne(id);
	}

	@Override
	public List<C> findAll() {
		return generalDao.findAll();
	}

	@Override
	public C save(C c) {
		return generalDao.save(c);
	}
	
	@Override
	public C saveAndFlush(C c){
		return generalDao.saveAndFlush(c);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <S extends C> List<S> save(Iterable<C> listC) {
		return (List<S>) generalDao.save(listC);
	}

	@Override
	public void deleteEntity(C c) {
		generalDao.delete(c);
		
	}

	@Override
	public void deleteId(K k) {
		generalDao.delete(k);
		
	}

	@Override
	public void deleteEntities(Iterable<C> listC) {
		generalDao.delete(listC);
		
	}

	@Override
	public void deleteIds(Iterable<K> listK) {
		for(K id : listK){
			generalDao.delete(id);
		}
	}
	
	protected void setDao(GeneralDao<C,K> dao){
		this.generalDao = dao;
	}

}
