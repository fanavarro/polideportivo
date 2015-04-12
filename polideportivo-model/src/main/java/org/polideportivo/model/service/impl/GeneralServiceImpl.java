package org.polideportivo.model.service.impl;

import java.io.Serializable;
import java.util.List;

import org.polideportivo.model.dao.api.GeneralDao;
import org.polideportivo.model.service.api.GeneralService;
import org.springframework.transaction.annotation.Transactional;

/**
 * The Class GeneralServiceImpl.
 *
 * @param <C> the generic type
 * @param <K> the key type
 */
@Transactional
public abstract class GeneralServiceImpl <C, K extends Serializable> implements GeneralService<C, K> {

	/** The general dao. */
	private GeneralDao<C,K> generalDao;
	
	
	/* (non-Javadoc)
	 * @see org.angular.model.service.api.GeneralService#findById(java.io.Serializable)
	 */
	@Override
	public C findById(K id) {
		return generalDao.findOne(id);
	}

	/* (non-Javadoc)
	 * @see org.angular.model.service.api.GeneralService#findAll()
	 */
	@Override
	public List<C> findAll() {
		return generalDao.findAll();
	}

	/* (non-Javadoc)
	 * @see org.angular.model.service.api.GeneralService#save(java.lang.Object)
	 */
	@Override
	public C save(C c) {
		return generalDao.save(c);
	}
	
	/* (non-Javadoc)
	 * @see org.angular.model.service.api.GeneralService#saveAndFlush(java.lang.Object)
	 */
	@Override
	public C saveAndFlush(C c){
		return generalDao.saveAndFlush(c);
	}

	/* (non-Javadoc)
	 * @see org.angular.model.service.api.GeneralService#save(java.lang.Iterable)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public <S extends C> List<S> save(Iterable<C> listC) {
		return (List<S>) generalDao.save(listC);
	}

	/* (non-Javadoc)
	 * @see org.angular.model.service.api.GeneralService#deleteEntity(java.lang.Object)
	 */
	@Override
	public void deleteEntity(C c) {
		generalDao.delete(c);
		
	}

	/* (non-Javadoc)
	 * @see org.angular.model.service.api.GeneralService#deleteId(java.io.Serializable)
	 */
	@Override
	public void deleteId(K k) {
		generalDao.delete(k);
		
	}

	/* (non-Javadoc)
	 * @see org.angular.model.service.api.GeneralService#deleteEntities(java.lang.Iterable)
	 */
	@Override
	public void deleteEntities(Iterable<C> listC) {
		generalDao.delete(listC);
		
	}

	/* (non-Javadoc)
	 * @see org.angular.model.service.api.GeneralService#deleteIds(java.lang.Iterable)
	 */
	@Override
	public void deleteIds(Iterable<K> listK) {
		for(K id : listK){
			generalDao.delete(id);
		}
	}
	
	/**
	 * Sets the dao.
	 *
	 * @param dao the dao
	 */
	protected void setDao(GeneralDao<C,K> dao){
		this.generalDao = dao;
	}

}
