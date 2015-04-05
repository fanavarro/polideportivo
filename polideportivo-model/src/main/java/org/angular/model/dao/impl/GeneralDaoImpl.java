package org.angular.model.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.angular.model.dao.api.GeneralDao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

/**
 * The Class GeneralDaoImpl.
 *
 * @param <C> the generic type
 * @param <K> the key type
 */
public abstract class GeneralDaoImpl<C, K extends Serializable> implements
		GeneralDao<C, K> {

	/** The entity manager. */
	@PersistenceContext
	protected EntityManager entityManager;
	
	/** The type. */
	private Class<C> type;

	/** The simple jpa repository. */
	private SimpleJpaRepository<C, K> simpleJpaRepository;

	/* (non-Javadoc)
	 * @see org.springframework.data.jpa.repository.JpaRepository#findAll()
	 */
	@Override
	public List<C> findAll() {
		return simpleJpaRepository.findAll();
	}

	/* (non-Javadoc)
	 * @see org.springframework.data.jpa.repository.JpaRepository#findAll(org.springframework.data.domain.Sort)
	 */
	@Override
	public List<C> findAll(Sort sort) {
		return simpleJpaRepository.findAll(sort);
	}

	/* (non-Javadoc)
	 * @see org.springframework.data.jpa.repository.JpaRepository#save(java.lang.Iterable)
	 */
	@Override
	public <S extends C> List<S> save(Iterable<S> entities) {
		return simpleJpaRepository.save(entities);
	}

	/* (non-Javadoc)
	 * @see org.springframework.data.jpa.repository.JpaRepository#flush()
	 */
	@Override
	public void flush() {
		simpleJpaRepository.flush();
	}

	/* (non-Javadoc)
	 * @see org.springframework.data.jpa.repository.JpaRepository#saveAndFlush(java.lang.Object)
	 */
	@Override
	public C saveAndFlush(C entity) {
		return simpleJpaRepository.saveAndFlush(entity);
	}

	/* (non-Javadoc)
	 * @see org.springframework.data.jpa.repository.JpaRepository#deleteInBatch(java.lang.Iterable)
	 */
	@Override
	public void deleteInBatch(Iterable<C> entities) {
		simpleJpaRepository.deleteInBatch(entities);

	}

	/* (non-Javadoc)
	 * @see org.springframework.data.jpa.repository.JpaRepository#deleteAllInBatch()
	 */
	@Override
	public void deleteAllInBatch() {
		simpleJpaRepository.deleteAllInBatch();
	}

	/* (non-Javadoc)
	 * @see org.springframework.data.repository.PagingAndSortingRepository#findAll(org.springframework.data.domain.Pageable)
	 */
	@Override
	public Page<C> findAll(Pageable pageable) {
		return simpleJpaRepository.findAll(pageable);
	}

	/* (non-Javadoc)
	 * @see org.springframework.data.repository.CrudRepository#save(S)
	 */
	@Override
	public <S extends C> S save(S entity) {
		return simpleJpaRepository.save(entity);
	}

	/* (non-Javadoc)
	 * @see org.springframework.data.repository.CrudRepository#findOne(java.io.Serializable)
	 */
	@Override
	public C findOne(K id) {
		return simpleJpaRepository.findOne(id);
	}

	/* (non-Javadoc)
	 * @see org.springframework.data.repository.CrudRepository#exists(java.io.Serializable)
	 */
	@Override
	public boolean exists(K id) {
		return simpleJpaRepository.exists(id);
	}

	/* (non-Javadoc)
	 * @see org.springframework.data.repository.CrudRepository#findAll(java.lang.Iterable)
	 */
	@Override
	public Iterable<C> findAll(Iterable<K> ids) {
		return simpleJpaRepository.findAll(ids);
	}

	/* (non-Javadoc)
	 * @see org.springframework.data.repository.CrudRepository#count()
	 */
	@Override
	public long count() {
		return simpleJpaRepository.count();
	}

	/* (non-Javadoc)
	 * @see org.springframework.data.repository.CrudRepository#delete(java.io.Serializable)
	 */
	@Override
	public void delete(K id) {
		simpleJpaRepository.delete(id);

	}

	/* (non-Javadoc)
	 * @see org.springframework.data.repository.CrudRepository#delete(java.lang.Object)
	 */
	@Override
	public void delete(C entity) {
		simpleJpaRepository.delete(entity);

	}

	/* (non-Javadoc)
	 * @see org.springframework.data.repository.CrudRepository#delete(java.lang.Iterable)
	 */
	@Override
	public void delete(Iterable<? extends C> entities) {
		simpleJpaRepository.delete(entities);

	}

	/* (non-Javadoc)
	 * @see org.springframework.data.repository.CrudRepository#deleteAll()
	 */
	@Override
	public void deleteAll() {
		simpleJpaRepository.deleteAll();
	}
	
	/**
	 * Inits the.
	 */
	@SuppressWarnings("unchecked")
	@PostConstruct
	protected void init(){
		Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        type = (Class<C>) pt.getActualTypeArguments()[0];
        
		simpleJpaRepository = new SimpleJpaRepository<C, K>(this.type, this.entityManager);
	}
}
